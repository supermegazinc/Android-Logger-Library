import java.io.FileInputStream
import java.util.Properties

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
}

val githubProperties = Properties()
githubProperties.load(FileInputStream(rootProject.file("github.properties")))

val versionName = "1.0"
val myArtifactId = rootProject.name
val gitUser = githubProperties["gpr.usr"].toString()
val gitKey = githubProperties["gpr.key"].toString()

android {
    namespace = "com.supermegazinc.${project.name}"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            consumerProguardFiles("proguard-project.txt")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

/*
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.$gitUser"
            artifactId = myArtifactId
            version = versionName
            artifact("${layout.buildDirectory.asFile.get().path}/outputs/aar/${project.name}-release.aar")
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/${gitUser}/${myArtifactId}")
            credentials {
                username = gitUser
                password = gitKey
            }
        }
    }
}
 */

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}