import config.LibVersions

dependencies {
    implementation(project(":parent"))

    implementation("com.google.auto.service:auto-service:${LibVersions.autoService}")
    implementation("com.google.errorprone:error_prone_core:${LibVersions.Build.errorprone}")

    testImplementation(project(":test"))
}
