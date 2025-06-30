package org.com.example.langchain4j.multiagent

import dev.langchain4j.agent.tool.Tool

class DestinationExpert {

    @Tool("Find activities and attractions for a given destination")
    fun findActivities(destination: String): String {
        return when {
            destination.equals("Paris", ignoreCase = true) -> """
                Popular activities in Paris:
                - Visit the Eiffel Tower and enjoy the panoramic views of the city
                - Explore the Louvre Museum and see the Mona Lisa
                - Visit Notre-Dame Cathedral (exterior viewing due to reconstruction)
                - Stroll along the Champs-Élysées
                - Take a Seine River cruise
                - Explore the Montmartre district and visit Sacré-Cœur Basilica
                - Visit the Palace of Versailles just outside the city
            """.trimIndent()
            
            destination.equals("London", ignoreCase = true) -> """
                Popular activities in London:
                - Visit the Tower of London and see the Crown Jewels
                - Watch the Changing of the Guard at Buckingham Palace
                - Explore the British Museum and its vast collection
                - Ride the London Eye for spectacular views
                - Visit the Houses of Parliament and Big Ben
                - Explore Hyde Park and Kensington Gardens
                - Take a boat tour on the Thames River
            """.trimIndent()
            
            destination.equals("Rome", ignoreCase = true) -> """
                Popular activities in Rome:
                - Visit the Colosseum and learn about its history
                - Explore the Roman Forum and Palatine Hill
                - Marvel at the Pantheon's architectural wonder
                - Throw a coin in the Trevi Fountain
                - Visit Vatican City, St. Peter's Basilica, and the Vatican Museums
                - Stroll through Piazza Navona and enjoy Italian gelato
                - Climb the Spanish Steps
            """.trimIndent()
            
            destination.equals("Tokyo", ignoreCase = true) -> """
                Popular activities in Tokyo:
                - Visit the Meiji Shrine in Shibuya
                - Experience the Shibuya Crossing, the world's busiest intersection
                - Explore the Senso-ji Temple in Asakusa
                - Shop in Ginza and Akihabara districts
                - Visit the Tokyo Skytree for panoramic views
                - Experience traditional Japanese culture in Asakusa
                - Try authentic Japanese cuisine at local restaurants
            """.trimIndent()
            
            destination.equals("New York", ignoreCase = true) -> """
                Popular activities in New York:
                - Visit Times Square and its vibrant atmosphere
                - Explore Central Park's vast green space
                - Visit the Metropolitan Museum of Art
                - See the Statue of Liberty and Ellis Island
                - Experience the views from the Empire State Building or One World Observatory
                - Walk across the Brooklyn Bridge
                - Explore diverse neighborhoods like SoHo, Chinatown, and Little Italy
            """.trimIndent()
            
            else -> "I don't have specific information about $destination, but I recommend researching local attractions, museums, historical sites, and local cuisine experiences for your visit."
        }
    }
    
    @Tool("Get travel tips for a given destination")
    fun getTravelTips(destination: String): String {
        return when {
            destination.equals("Paris", ignoreCase = true) -> """
                Travel tips for Paris:
                - The Paris Metro is an efficient way to get around the city
                - Consider purchasing a Paris Museum Pass if visiting multiple attractions
                - Learn basic French phrases for better interactions
                - Be aware of pickpockets in tourist areas
                - Many museums are closed on Mondays or Tuesdays
                - Tipping is not required, as service is included in restaurant bills
            """.trimIndent()
            
            destination.equals("London", ignoreCase = true) -> """
                Travel tips for London:
                - Get an Oyster card for public transportation
                - Many museums and galleries are free to enter
                - Always carry an umbrella as weather can be unpredictable
                - Look to the right first when crossing roads
                - Book theater tickets in advance for West End shows
                - Pubs typically stop serving food by 9 PM
            """.trimIndent()
            
            destination.equals("Rome", ignoreCase = true) -> """
                Travel tips for Rome:
                - Carry water and wear comfortable shoes for walking
                - Book tickets for major attractions in advance to avoid long lines
                - Be aware of the midday closure of many shops
                - Use public transport or walk, as driving can be challenging
                - Dress appropriately when visiting religious sites
                - Learn a few basic Italian phrases
            """.trimIndent()
            
            destination.equals("Tokyo", ignoreCase = true) -> """
                Travel tips for Tokyo:
                - Get a Suica or Pasmo card for public transportation
                - Be respectful in public spaces and follow local customs
                - Learn basic Japanese phrases and download a translation app
                - Carry cash, as many places don't accept credit cards
                - Tipping is not customary in Japan
                - Be aware of rush hours when using public transport
            """.trimIndent()
            
            destination.equals("New York", ignoreCase = true) -> """
                Travel tips for New York:
                - Purchase a MetroCard for subway and bus travel
                - Tipping is customary (15-20% in restaurants)
                - Manhattan is laid out in a grid, making navigation easier
                - Look for TKTS booths for discounted Broadway tickets
                - Wear comfortable walking shoes
                - Be prepared for varying weather conditions
            """.trimIndent()
            
            else -> "For traveling to $destination, I recommend researching local transportation options, checking visa requirements, understanding local customs, and familiarizing yourself with common phrases in the local language."
        }
    }
}
