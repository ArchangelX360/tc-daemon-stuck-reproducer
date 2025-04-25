plugins {
    kotlin("multiplatform") version "2.1.20"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.configureEach {
            kotlinOptions.apiVersion = "2.1"
            kotlinOptions.languageVersion = "2.1"
            kotlinOptions.jvmTarget = "21"
        }
    }
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}