package org.com.example.langchain4j.aiservice

import dev.langchain4j.service.SystemMessage
// Removed AiService import and annotation since we're providing custom implementation

/**
 * Interface for the Assistant
 * The @SystemMessage annotation is kept for documentation purposes
 * but won't be processed since @AiService is removed
 */
interface Assistant {

    @SystemMessage("You are a polite assistant")
    fun chat(userMessage: String): String
}