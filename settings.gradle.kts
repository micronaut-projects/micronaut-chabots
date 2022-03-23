pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("io.micronaut.build.shared.settings") version "5.3.0"
}

rootProject.name = "chatbots-parent"

include("chatbots-telegram-http-client")
include("chatbots-bom")
