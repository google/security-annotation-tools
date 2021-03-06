/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/6.8.2/userguide/multi_project_builds.html
 */

rootProject.name = "security-annotation-tools"

include("annotations")
include("parent")
include("platform")
include("platform-bom")
include("test")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

apply(from = "buildSrc/settings.gradle.kts")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            // Auto Value
            val autoValueVersion = "1.9"

            library("google-auto-value-core", "com.google.auto.value", "auto-value").version(autoValueVersion)
            library("google-auto-value-annotations", "com.google.auto.value", "auto-value-annotatios").version {
                require(autoValueVersion)
            }

            bundle("google-auto-value", listOf("google-auto-value-core", "google-auto-value-annotations"))

            // Auto Factory
            library("google-auto-factory-core", "com.google.auto.factory", "auto-factory").version("1.0.1")

            // Auto Service
            val autoServiceVersion = "1.0.1"

            library("google-auto-service-core", "com.google.auto.service", "auto-service").version(autoServiceVersion)
            library("google-auto-service-annotations", "com.google.auto.service", "auto-service-annotations").version {
                require(autoServiceVersion)
            }

            bundle("google-auto-service", listOf("google-auto-service-core", "google-auto-service-annotations"))

            // Guava
            val guavaVersion = "[31.1-jre, 32.0-jre["

            library("google-guava-core", "com.google.guava", "guava").version(guavaVersion)
            library("google-guava-bom", "com.google.guava", "guava-bom").version {
                require(guavaVersion)
            }

            // JUnit
            val junitVersion = "5.8.2"

            library("test-junit-bom", "org.junit", "junit-bom").version(junitVersion)
            library("test-junit-core", "org.junit.jupiter", "junit-jupiter").version(junitVersion)
            library("test-junit-vintage-engine", "org.junit.vintage", "junit-vintage-engine").version(junitVersion)

            // AssertJ
            library("test-assertj-core", "org.assertj", "assertj-core").version("3.22.0")
            library("test-assertj-guava", "org.assertj", "assertj-guava").version("3.4.0")

            bundle("test-assertj", listOf("test-assertj-core", "test-assertj-guava"))

            // Checkerframework
            val checkerVersion = "3.21.3"

            library("checker-framework-virtual-platform", "org.checkerframework", "checker-virtual-platform").version {
                prefer("3.21.3")
            }
            library("checker-framework-core", "org.checkerframework", "checker").version(checkerVersion)
            library("checker-framework-qual", "org.checkerframework", "checker-qual").version(checkerVersion)

            bundle("checker-framework", listOf("checker-framework-core", "checker-framework-qual"))

            library("jsr305", "com.google.code.findbugs", "jsr305").version {
                require("3.0.0")
            }

            // Logging

            val slf4jVersion = "[1.7.0, 2.0.0["

            library("logging-slf4j-virtual-platform", "org.slf4j", "slf4j-virtual-platform").version {
                strictly(slf4jVersion)
            }

            library("logging-slf4j-api", "org.slf4j", "slf4j-api").version {
                strictly(slf4jVersion)
            }

            bundle("logging-slf4j", listOf("logging-slf4j-api"))

            library("logging-logback-core", "ch.qos.logback", "logback-core").version {
                strictly("[1.2.3, 1.3[")
            }

            library("logging-slf4j-jul-transformer", "org.slf4j", "jul-to-slf4j").version(slf4jVersion)
            library("logging-slf4j-log4j-transformer", "org.slf4j", "log4j-over-slf4j").version(slf4jVersion)

            bundle(
                "logging-logback",
                listOf(
                    "logging-logback-core",
                    "logging-slf4j-jul-transformer",
                    "logging-slf4j-log4j-transformer"
                )
            )

            library("logging-log4j-bom", "org.apache.logging.log4j", "log4j-bom").version {
                require("2.17.2")
            }
        }
    }
}
