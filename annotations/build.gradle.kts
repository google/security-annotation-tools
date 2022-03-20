import config.LibVersions

dependencies {
    implementation(project(":parent"))
    implementation("org.checkerframework:checker:${LibVersions.checkerFramework}")
    implementation("org.checkerframework:checker-qual:${LibVersions.checkerFramework}")

    testImplementation(project(":test"))
}
