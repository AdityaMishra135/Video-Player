plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.sultanAyubi.videoPlayer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sultanAyubi.videoPlayer"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            isDebuggable = false
            isShrinkResources = true
        }

        debug {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            isDebuggable = true
            isShrinkResources = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    //for ViewBinding
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.work.runtime)


    implementation(libs.androidx.legacy)

    //for glide
    implementation(libs.glide)

    //for exoplayer
    implementation(libs.exoplayerCore)
    implementation(libs.exoplayerUi)

    //for playing online content
    implementation(libs.exoplayerDash)

    //for vertical progress bar
    implementation(libs.verticalSeekbar)

    //for doubleTapFeature
    implementation(libs.doubleTapPlayerView)

    //custom chrome tabs for integrating youtube
    implementation(libs.androidx.browser)
}