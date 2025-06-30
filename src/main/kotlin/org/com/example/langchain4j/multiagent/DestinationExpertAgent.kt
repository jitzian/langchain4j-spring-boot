package org.com.example.langchain4j.multiagent

import dev.langchain4j.service.SystemMessage

interface DestinationExpertAgent {

    @SystemMessage("""
        You are a destination expert agent.
        You provide detailed information about activities, attractions, and recommendations for travel destinations.
        When asked about a destination, provide relevant information based on the tools available to you.
        Be informative and helpful.
    """)
    fun findActivities(destination: String): String
}
