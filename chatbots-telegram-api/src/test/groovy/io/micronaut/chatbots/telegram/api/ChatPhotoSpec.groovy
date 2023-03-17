package io.micronaut.chatbots.telegram.api

import io.micronaut.context.BeanContext
import io.micronaut.core.beans.BeanIntrospection
import io.micronaut.core.type.Argument
import io.micronaut.serde.ObjectMapper
import io.micronaut.serde.SerdeIntrospections
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

import jakarta.validation.Validator

@MicronautTest(startApplication = false)
class ChatPhotoSpec extends Specification {
    @Inject
    ObjectMapper objectMapper

    @Inject
    Validator validator

    @Inject
    BeanContext beanContext

    void "ChatPhoto is annotated with @Serdeable.Deserializable"() {
        given:
        SerdeIntrospections serdeIntrospections = beanContext.getBean(SerdeIntrospections)

        when:
        serdeIntrospections.getDeserializableIntrospection(Argument.of(ChatPhoto))

        then:
        noExceptionThrown()
    }

    void "ChatPhoto is annotated with @Serdeable.Serializable"() {
        given:
        SerdeIntrospections serdeIntrospections = beanContext.getBean(SerdeIntrospections)

        when:
        serdeIntrospections.getSerializableIntrospection(Argument.of(ChatPhoto))

        then:
        noExceptionThrown()
    }

    void "ChatPhoto is annotated with Introspected"() {
        when:
        BeanIntrospection.getIntrospection(ChatPhoto)

        then:
        noExceptionThrown()
    }

    void "ChatPhoto::toString() does not throw NPE"() {
        when:
        new ChatPhoto().toString()

        then:
        noExceptionThrown()
    }

    void "valid ChatPhoto does not trigger any constraint exception"() {
        when:
        ChatPhoto el = validChatPhoto()

        then:
        validator.validate(el).isEmpty()
    }

    static ChatPhoto validChatPhoto() {
        ChatPhoto el = new ChatPhoto()
        el.smallFileId = "x"
        el.smallFileUniqueId = "y"
        el.bigFileUniqueId = "x"
        el.bigFileId = "y"
        el
    }
}
