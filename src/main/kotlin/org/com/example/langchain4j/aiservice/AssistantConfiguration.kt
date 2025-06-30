package org.com.example.langchain4j.aiservice

import dev.langchain4j.memory.ChatMemory
import dev.langchain4j.memory.chat.MessageWindowChatMemory
import dev.langchain4j.model.chat.ChatModel
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Configuration
class AssistantConfiguration {

    /**
     * This chat memory will be used by an [Assistant]
     */
    @Bean
    fun chatMemory(): ChatMemory = MessageWindowChatMemory.withMaxMessages(10)

    /**
     * Direct implementation of Assistant interface
     * Now that we've removed @AiService annotation from the interface, 
     * we can use the standard bean name
     */
    @Bean
    @Primary
    fun assistant(chatModel: ChatModel): Assistant {
        return object : Assistant {
            override fun chat(userMessage: String): String {
                return chatModel.chat(userMessage)
            }
        }
    }

    /**
     * Direct implementation of StreamingAssistant interface
     * For now, just return the regular chat response as a Flux with a single element
     * to avoid issues with the streaming API
     */
    @Bean
    @Primary
    fun streamingAssistant(chatModel: ChatModel): StreamingAssistant {
        return object : StreamingAssistant {
            override fun chat(userMessage: String): Flux<String> {
                // Using regular ChatModel for now and wrapping the response in a Flux
                return Mono.fromCallable { chatModel.chat(userMessage) }.flux()
            }
        }
    }
}
