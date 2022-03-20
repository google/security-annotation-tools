import config.LibVersions

apply(plugin = "com.diffplug.spotless")

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    java {
        removeUnusedImports()
        googleJavaFormat(LibVersions.Build.javaFormat)
        licenseHeaderFile("$rootDir/license_header.txt")
    }

    kotlin {
        target("**/src/**/*.kt")

        ktlint(LibVersions.Build.ktlint)
        trimTrailingWhitespace()
        indentWithSpaces(4)
        endWithNewline()

        licenseHeaderFile("$rootDir/license_header.txt")
    }

    kotlinGradle {
        target("**/*.gradle.kts", "*.gradle.kts")

        ktlint(LibVersions.Build.ktlint)
        trimTrailingWhitespace()
        indentWithSpaces(4)
        endWithNewline()
    }

    /*
     * Our use cases generally have order-independent keys, which lets us make
     * them alphabetical.  Also everything is in "JSON with Comments" and not
     * "json5" or an equivalent, so it makes sense to set the formatter
     * explicitly.
     */
    format("settingJson") {
        target("**/*.json", "*.json")

        prettier(
            mapOf(
                "prettier-plugin-sort-json" to LibVersions.Build.prettierSortJson
            )
        ).configFile("$rootDir/.prettierrc.yml")
    }

    format("markdown") {
        target("**/*.md", "*.md")

        prettier().configFile("$rootDir/.prettierrc.yml")
    }

    format("yaml") {
        target("**/*.yaml", "**/*.yml", "*.yaml", "*.yml")

        prettier().configFile("$rootDir/.prettierrc.yml")
    }
}
