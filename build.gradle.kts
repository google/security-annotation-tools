// This file is needed by spotless.

plugins {
    idea
    `java-library`
    
    id("com.diffplug.spotless") version "5.12.1"
    id("net.ltgt.errorprone") version "2.0.1"
}

import net.ltgt.gradle.errorprone.errorprone

repositories {
    google()
    mavenCentral()
}

subprojects {
    apply(plugin="idea")
    apply(plugin="java-library")
    apply(plugin="com.diffplug.spotless")
    apply(plugin="net.ltgt.errorprone")
    
    repositories {
        google()
        mavenCentral()
    }
    
    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    
    dependencies {
        errorprone("com.google.errorprone:error_prone_core:${LibVersions.errorprone}")
    }
    
    tasks.withType<JavaCompile>().configureEach {
        options.errorprone.disableWarningsInGeneratedCode.set(true)
        shouldRunAfter("spotlessJava")
        shouldRunAfter("spotlessApply")
    }

    spotless {
        java {
            removeUnusedImports()
            googleJavaFormat()
            licenseHeaderFile("$rootDir/license_header.txt")
        }
    }

}

defaultTasks("build")