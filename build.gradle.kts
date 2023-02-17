plugins {

    `java-gradle-plugin`
    kotlin("jvm") version "1.7.10"
    id("com.autonomousapps.plugin-best-practices-plugin") version "0.9"
}

group = "dev.whosnickdoglio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}
