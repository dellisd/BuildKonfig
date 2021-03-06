package com.codingfeline.buildkonfig.buildsrc

object Versions {
    const val compileSdk = 29
    const val kotlin = "1.3.71"
    const val dokka = "0.10.1"
    const val jvmTarget = "1.8"
    const val benManesVersionsPlugin = "0.28.0"
    const val gradle = "5.6.4"
}

object Dependencies {
    const val androidPlugin = "com.android.tools.build:gradle:3.6.1"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val serializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    const val dokkaPlugin = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
    const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.benManesVersionsPlugin}"
    const val pluginPublishPlugin = "com.gradle.publish:plugin-publish-plugin:0.11.0"

    const val kotlinPoet = "com.squareup:kotlinpoet:1.5.0"
    const val junit = "junit:junit:4.13"
    const val truth = "com.google.truth:truth:1.0.1"
}
