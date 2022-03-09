import config.LibVersions

dependencies {
    api("org.assertj:assertj-core:${LibVersions.Test.assertj}")
    api("org.assertj:assertj-guava:${LibVersions.Test.assertjGuava}")
    api("junit:junit:${LibVersions.Test.junit}")

    implementation(project(":parent"))
}
