plugins {
    id("groovy-gradle-plugin")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(libs.gradle.kotlin)
    implementation(libs.sonatype.scan)
}
