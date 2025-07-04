package org.com.example.langchain4j.multiagent

import org.com.example.langchain4j.aiservice.MemoryManager
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MultiAgentController(private val travelPlannerAgent: TravelPlannerAgent) {

    /*@GetMapping("/travel-planner")
    fun plan(
        @RequestParam query: String
    ): String {
        return travelPlannerAgent.plan(query)
    }*/

    /*@GetMapping("/travel-planner")
    fun plan(
        @RequestParam(
            value = "query",
            //defaultValue = "Paris"
            defaultValue = "Mexico"
        ) query: String
    ): String {
        return travelPlannerAgent.plan(query)
    }*/

    @RestController
    class MultiAgentController(
        private val travelPlannerAgent: TravelPlannerAgent,
        private val memoryManager: MemoryManager // Inject the memory manager
    ) {
        @GetMapping("/travel-planner")
        fun plan(
            @RequestParam query: String,
            @RequestParam(required = false, defaultValue = "Mexico") userId: String
        ): String {
            // Get or create memory for this user
            val memory = memoryManager.getMemoryForUser(userId)

            // Add the user message to memory
            memory.add(dev.langchain4j.data.message.UserMessage(query))

            // Get the response from the agent
            val response = travelPlannerAgent.plan(query)

            // Store the AI response in memory
            memory.add(dev.langchain4j.data.message.AiMessage(response))

            return response
        }
    }
}
