rootProject.name = "basic-multiproject"
include(":dependencyManagement")
include(":app")
include(":app1")

include("code-coverage-report")

pluginManagement {
    repositories{
        maven {
            url = uri("https://maven.aliyun.com/repository/gradle-plugin")
        }
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/central")
        }
    }
}
