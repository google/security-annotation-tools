/**
 * The core java library representation. Most components will inherit from here.
 */

plugins {
    id("sectypes.java.min")
}

dependencies {
    implementation(project(":parent"))

    testImplementation(project(":test"))
}
