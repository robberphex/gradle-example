rootProject.name = "basic-multiproject"
include(":dependencyManagement")
include(":app")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}