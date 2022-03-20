import config.LibVersions

dependencies {
    api(platform("org.junit:junit-bom:${LibVersions.Test.junit5}"))

    api("org.assertj:assertj-core:${LibVersions.Test.assertj}")
    api("org.assertj:assertj-guava:${LibVersions.Test.assertjGuava}")
    api("org.junit.jupiter:junit-jupiter:${LibVersions.Test.junit5}")

    implementation(project(":parent"))

    runtimeOnly("org.junit.vintage:junit-vintage-engine:${LibVersions.Test.junit5}")
}
