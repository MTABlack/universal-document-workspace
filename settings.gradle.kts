pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "UniversalDocumentWorkspace"

include(
    ":app",
    ":core",
    ":core-ui",
    ":file-manager",
    ":document-engine",
    ":pdf-engine",
    ":scanner",
    ":search",
    ":share",
    ":workspace",
    ":security",
    ":settings"
)
