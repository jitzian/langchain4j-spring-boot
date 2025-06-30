# LangChain4j Spring Boot Example in Kotlin

This project is a rewritten Kotlin example from
the [langchain4j-examples](https://github.com/langchain4j/langchain4j-examples/tree/main/spring-boot-example)
repository. It demonstrates how to use `langchain4j` with Spring Boot in a Kotlin application.

## Requirements

- Java 17 or higher
- Kotlin 2.0.x or higher
- Gradle 8.x or higher
- Ollama installed locally (visit [Ollama website](https://ollama.ai/) to install)
- IDE with Kotlin support (IntelliJ IDEA recommended)
- Git for version control

## Technologies Used

- Spring Boot 3.2.4
  - spring-boot-starter-web
  - spring-boot-starter-webflux
- Kotlin 2.0.x
  - kotlinx-coroutines-reactor
  - kotlin-reflect
- Langchain4j 1.0.1-beta6
  - langchain4j-spring-boot-starter
  - langchain4j-ollama-spring-boot-starter
- Ollama integration
- WebFlux for reactive programming
- Kotlin Coroutines for asynchronous programming

## Running the Project

1. Clone the repository:
    ```bash
    git clone https://github.com/devcrocod/kotlin-ai-examples.git
    ```

2. Navigate to the project directory:
    ```bash
    cd kotlin-ai-examples/projects/langchain4j/langchain4j-spring-boot
    ```

3. Build and run the project using Gradle:

   [MacOS/Linux]
    ```bash
    ./gradlew bootRun
    ```
   [Windows]
    ```shell
   gradlew.bat bootRun
    ```

4. The project will start by default at `http://localhost:8080`.

## Project Structure

- **`build.gradle.kts`**: The project configuration, including all necessary dependencies and plugins for Kotlin, Spring
  Boot, and langchain4j.
- **`src/main/kotlin`**: The source code of the project written in Kotlin.
- **`src/main/resources`**: The project's resources, such as configuration files.

## Main Dependencies

- `langchain4j-spring-boot-starter`: For integrating LangChain into Spring Boot.
- `langchain4j-ollama-spring-boot-starter`: For working with the Ollama API.
- `spring-boot-starter-web` and `spring-boot-starter-webflux`: For creating REST APIs and supporting asynchronous
  programming.

## How to Use

1. Install Ollama from [ollama.ai](https://ollama.ai/) and ensure it's running locally.

2. Pull the llama3 model (or any other model you prefer):
   ```bash
   ollama pull llama3
   ```

3. Configure Ollama in `application.properties`:
   ```properties
   langchain4j.ollama.chat-model.base-url=http://localhost:11434
   langchain4j.ollama.chat-model.model-name=llama3
   ```

4. The project supports asynchronous operations using `WebFlux` and `Reactor`.

## Additional Information

- The project utilizes Kotlin Coroutines and integrates with Spring Boot for asynchronous interaction with the Ollama
  API.
- This example demonstrates how to use the `langchain4j` and `langchain4j-ollama` libraries in a Kotlin project with
  Spring Boot.

## Links

- Original Java
  example: [langchain4j-examples/spring-boot-example](https://github.com/langchain4j/langchain4j-examples/tree/main/spring-boot-example)
- [Langchain4j Documentation](https://github.com/langchain4j/langchain4j)
