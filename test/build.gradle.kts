plugins {
    id("sectypes.java.min")
}

dependencies {
    implementation(project(":parent"))

    api(platform(libs.test.junit.bom))

    api(libs.bundles.test.assertj)
    api(libs.test.junit.core)

    // Most of the system uses the bare `slf4j-api` to allow plugging
    // with whatever technology. In tests, however, we'll use logback
    // directly.
    api(libs.bundles.logging.slf4j)
    api(libs.bundles.logging.logback)

    // Using the vintage engine for integration with legacy rules and such
    runtimeOnly(libs.test.junit.vintage.engine)
}
