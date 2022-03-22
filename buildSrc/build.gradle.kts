plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(buildLibs.bundles.spotless)
    implementation(buildLibs.bundles.errorprone)
}
