plugins {
    alias(framerLibs.plugins.android.library)
}

android {
    namespace = "com.example.framer"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(framerLibs.androidx.core.ktx)
    implementation(framerLibs.androidx.appcompat)
    implementation(framerLibs.material)
    implementation(framerLibs.androidx.runtime.android)
    testImplementation(framerLibs.junit)
    androidTestImplementation(framerLibs.androidx.junit)
    androidTestImplementation(framerLibs.androidx.espresso.core)
}