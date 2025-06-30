package org.com.example.langchain4j.multiagent

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
    @GetMapping("/travel-planner")
    fun plan(
        @RequestParam(
            value = "query",
            defaultValue = "Paris"
        ) query: String
    ): String {
        return travelPlannerAgent.plan(query)
    }
}
