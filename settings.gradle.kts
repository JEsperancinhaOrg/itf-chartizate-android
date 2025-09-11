pluginManagement {
    repositories {
        google()
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
    }
    // Use version catalog for plugin versions
    includeBuild("gradle")
}

include(":itf-chartizate-android")
