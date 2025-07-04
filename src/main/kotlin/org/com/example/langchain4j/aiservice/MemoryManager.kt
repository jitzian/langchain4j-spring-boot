package org.com.example.langchain4j.aiservice

import dev.langchain4j.memory.ChatMemory
import dev.langchain4j.memory.chat.MessageWindowChatMemory
import org.com.example.langchain4j.GlobalConstants.MAX_MESSAGES
import org.springframework.stereotype.Service
import java.util.concurrent.ConcurrentHashMap

@Service
class MemoryManager {
    private val memories = ConcurrentHashMap<String, ChatMemory>()

    fun getMemoryForUser(userId: String): ChatMemory {
        return memories.computeIfAbsent(userId) {
            MessageWindowChatMemory.withMaxMessages(MAX_MESSAGES)
        }
    }
}