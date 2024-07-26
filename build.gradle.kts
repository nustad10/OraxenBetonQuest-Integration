plugins {
    id("java")
    // other plugins
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("libs/BetonQuest-1.12.0.jar")) // Adjust the JAR file name if necessary
}
