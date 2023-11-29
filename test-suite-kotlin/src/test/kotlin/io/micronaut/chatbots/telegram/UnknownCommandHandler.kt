package io.micronaut.chatbots.telegram

import io.micronaut.chatbots.core.SpaceParser
import io.micronaut.chatbots.telegram.api.Chat
import io.micronaut.chatbots.telegram.api.Update
import io.micronaut.chatbots.telegram.api.send.SendMessage
import io.micronaut.chatbots.telegram.core.SendMessageUtils
import io.micronaut.chatbots.telegram.core.TelegramBotConfiguration
import io.micronaut.chatbots.telegram.core.TelegramHandler
import io.micronaut.context.annotation.Requires
import io.micronaut.core.order.Ordered
import jakarta.inject.Singleton
import java.util.Optional

@Requires(property = "spec.name", value = "telegram")
// tag::class[]
@Singleton
class UnknownCommandHandler(private val spaceParser: SpaceParser<Update, Chat>) : TelegramHandler<SendMessage> {

    override fun canHandle(bot: TelegramBotConfiguration?, input: Update) = true // <1>

    override fun handle(bot: TelegramBotConfiguration?, input: Update): Optional<SendMessage> =
        SendMessageUtils.compose(
            spaceParser,
            input,
            "I don't how to handle your query: ${input.message.text}"
        )

    override fun getOrder() = Ordered.LOWEST_PRECEDENCE // <2>
}
// end::class[]
