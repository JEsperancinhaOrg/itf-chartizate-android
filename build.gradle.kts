// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.omni)
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.google.guava:guava") {
            version {
                strictly(libs.versions.guava.get())
            }
        }
    }
}
allprojects {
    version = "6.0.1"
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}
