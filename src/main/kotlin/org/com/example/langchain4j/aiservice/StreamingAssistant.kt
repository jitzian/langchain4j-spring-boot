package org.com.example.langchain4j.aiservice

import dev.langchain4j.service.SystemMessage
// Removed AiService import and annotation since we're providing custom implementation
import reactor.core.publisher.Flux

/**
 * Interface for the StreamingAssistant
 * The @SystemMessage annotation is kept for documentation purposes
 * but won't be processed since @AiService is removed
 */
interface StreamingAssistant {

    @SystemMessage("You are a polite assistant")
    fun chat(userMessage: String): Flux<String>
}