/**
 * A plugin to be referenced by other plugins. Configures spotless and the various
 * tools that it uses.
 */
plugins {
    id("com.diffplug.spotless")
}

repositories {
    google()
    mavenCentral()
}

dependencies {
}

spotless {
    kotlinGradle {
        target("**/*.gradle.kts", "*.gradle.kts")

        ktlint("0.44.0")
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
                "prettier-plugin-sort-json" to "0.0.2"
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
