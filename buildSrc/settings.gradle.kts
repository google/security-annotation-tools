dependencyResolutionManagement {
    versionCatalogs {
        create("buildLibs") {
            // Spotless
            version("spotless", "6.3.0")
            version("google-java-format", "1.13.0")
            library("spotless-plugin", "com.diffplug.spotless", "spotless-plugin-gradle").versionRef("spotless")
            library("google-java-format", "com.google.googlejavaformat", "google-java-format").versionRef("google-java-format")
            library("ktlint", "com.pinterest", "ktlint").version {
                strictly("[0.44.0, 0.45.0[")
            }

            bundle("spotless", listOf("spotless-plugin", "google-java-format", "ktlint"))

            // Errorprone
            version("errorprone-plugin", "2.0.2")

            library("errorprone-plugin", "net.ltgt.gradle", "gradle-errorprone-plugin").versionRef("errorprone-plugin")
            library("errorprone-core", "com.google.errorprone", "error_prone_core").version {
                strictly("[2.11.0, 2.12.0[")
                prefer("2.11.0")
            }

            bundle("errorprone", listOf("errorprone-plugin", "errorprone-core"))
        }
    }
}
