/**
 * An absolute minimal java setup, without sacrificing any of the wiring
 * required for various standards.
 */
import net.ltgt.gradle.errorprone.errorprone

plugins {
    `java-library`
    id("net.ltgt.errorprone")
    id("sectypes.core")
    id("sectypes.versions")
}

repositories {
    google()
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11

    modularity.inferModulePath.set(true)
    withSourcesJar()
}

dependencies {
    errorprone("com.google.errorprone:error_prone_core:2.11.0")

    api(platform(project(":platform")))
}

tasks.withType<JavaCompile>().configureEach {
    options.errorprone.disableWarningsInGeneratedCode.set(true)
    shouldRunAfter("spotlessJava")
    shouldRunAfter("spotlessApply")
}

tasks.withType<JavaCompile>().configureEach {
    options.isFork = true
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Test>().configureEach {
    maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2 + 1).takeIf { it > 1 } ?: 2
}

spotless {
    java {
        removeUnusedImports()
        googleJavaFormat("1.14.0")
        licenseHeaderFile("$rootDir/license_header.txt")
    }
}
