package io.micronaut.chatbots.basecamp

import io.micronaut.chatbots.basecamp.api.Query
import io.micronaut.chatbots.basecamp.core.BasecampBotConfiguration
import io.micronaut.chatbots.basecamp.core.BasecampHandler
import jakarta.inject.Singleton

import jakarta.validation.constraints.NotNull

@Singleton
class HelloWorldHandler implements BasecampHandler {

    @Override
    boolean canHandle(BasecampBotConfiguration bot, @NotNull Query input) {
        true
    }

    @Override
    Optional<String> handle(BasecampBotConfiguration bot, @NotNull Query input) {
        Optional.of("Hello World")
    }
}

