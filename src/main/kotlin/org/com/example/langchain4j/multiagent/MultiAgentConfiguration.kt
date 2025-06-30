package org.com.example.langchain4j.multiagent

import dev.langchain4j.model.chat.ChatModel
import dev.langchain4j.service.AiServices
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MultiAgentConfiguration {

    @Bean
    fun destinationExpert() = DestinationExpert()

    @Bean
    fun destinationExpertAgent(chatModel: ChatModel): DestinationExpertAgent {
        return AiServices.builder(DestinationExpertAgent::class.java)
            .chatModel(chatModel)
            .tools(destinationExpert())
            .build()
    }

    @Bean
    fun travelPlannerAgent(chatModel: ChatModel, destinationExpertAgent: DestinationExpertAgent): TravelPlannerAgent {
        return AiServices.builder(TravelPlannerAgent::class.java)
            .chatModel(chatModel)
            .tools(destinationExpertAgent)
            .build()
    }
}
