plugins {
    id("io.micronaut.build.internal.docs")
    id("io.micronaut.build.internal.quality-reporting")
}

repositories {
    mavenCentral()
    maven { setUrl("https://s01.oss.sonatype.org/content/repositories/snapshots/") }
}

if (System.getenv("SONAR_TOKEN") != null) {
    configure<org.sonarqube.gradle.SonarExtension> {
        properties {
            // Ignore duplication on the api classes as they are DTOs for Serde serialization
            property("sonar.cpd.exclusions", "**/io/micronaut/chatbots/telegram/api/**")
        }
    }
}
