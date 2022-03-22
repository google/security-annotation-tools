plugins {
    `java-platform`
    `maven-publish`
    id("sectypes.core")
}

publishing {
    publications {
        create<MavenPublication>("sectypes") {
            groupId = "com.google.apigee.sectypes"
            artifactId = "sectypes-bom"

            from(components["javaPlatform"])

            pom {
                name.set("Security Annotation Tools")
                url.set("https://github.com/google/security-annotation-tools")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0")
                    }
                }
            }
        }
    }
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform(project(":platform")))

    api(project(":annotations"))
    api(project(":parent"))
    api(project(":test"))
}
