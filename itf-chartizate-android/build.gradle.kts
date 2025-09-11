plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jacoco)
}

android {
    namespace = "org.jesperancinha.chartizate"

    defaultConfig {
        compileSdk = libs.versions.compileSdk.get().toInt()
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    lint {
        abortOnError = false
    }
    packagingOptions {
        resources {
            excludes += setOf("META-INF/LICENSE.md", "META-INF/LICENSE-notice.md")
        }
    }
    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
    }
}

val siteUrl = "https://github.com/JEsperancinhaOrg/itf-chartizate-android"
val gitUrl = "scm:git:https://github.com/JEsperancinhaOrg/itf-chartizate-android.git"


tasks.register<JacocoReport>("jacocoTestReport") {
    dependsOn(tasks.withType<Test>())
    reports {
        xml.required.set(true)
        csv.required.set(false)
        html.required.set(false)
    }
}


dependencies {
    implementation(libs.chartizate)
}

