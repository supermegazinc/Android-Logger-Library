# Installation

## Using Jitpack

1. Open the settings.gradle.kts file and add the following:
   
   ```Gradle
   dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
   ```

2. Add the dependency ```com.github.supermegazinc:Android-Logger-Library:VERSION``` in your build.gradle.kts (app) or version catalog

## Manually

1. Download the source code
2. Open your project root folder and create a new folder with the desired name for this library (eg. "logger_library")
3. Extract the code in the folder
4. In your "settings.gradle.kts" add the following lines in the end:
```Gradle
include(":logger_library")
```
5. In your build.gradle.kts (app) add the following dependencies: 
```Gradle
implementation(project(":logger_library"))
```
