# aSoft Limited

A repository for the aSoft Limited hands on kotlin developer interview.

## Ready, Set, Go!
In order to maximize on the time you have for the interview, please make sure you have the following setup:

- This project is opened up in a convenient IDE ( IntelliJ IDEA or any other IntelliJ Platform IDE i.e. Android Studio)
- Gradle has synced and downloaded all dependencies
- Your IDE of choice has finished indexing the project

Hint: While not an issue, IDEs that are not members of the IntelliJ Platform (i.e. VSCode) are discouraged

## Introduction
This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop, Server.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/server` is for the Ktor server application.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.

## Tasks
You will be informed on the tasks you have to do during the interview