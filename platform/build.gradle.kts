plugins {
    `java-platform`
    id("sectypes.core")
}

javaPlatform {
}

dependencies {

    constraints {
        // We do not actually use log4j, but on the offchance that a dependecy
        // were to, this will help protect against the log4shell vulnerability.
        api(platform(libs.logging.log4j.bom))

        api(platform(libs.checker.framework.virtual.platform))
        api(platform(libs.logging.slf4j.virtual.platform))

        api(platform(libs.google.guava.bom))

        api(libs.bundles.checker.framework)
        api(libs.bundles.google.auto.service)
        api(libs.bundles.google.auto.value)
        api(libs.bundles.test.assertj)

        api(libs.google.auto.factory.core)
        api(libs.google.guava.core)

        api(libs.bundles.logging.slf4j)
        api(libs.bundles.logging.logback)

        api(libs.test.junit.core)

        runtime(libs.test.junit.vintage.engine)
    }
}
