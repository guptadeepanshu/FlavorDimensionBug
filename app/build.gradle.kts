plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.example.apps.flavordimensionbug"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    flavorDimensions("fruit")
    productFlavors {
        create("apple") {
            dimension = "fruit"
        }

        create("orange") {
            dimension = "fruit"
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.1.0")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
