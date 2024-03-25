plugins {
    java
    jacoco
}

version = "1.0.2"
group = "org.gradle.sample"

repositories {
    maven {
        url = uri("https://maven.aliyun.com/repository/central")
    }
}

//pluginManagement {
//    repositories{
//        maven {
//            url = uri("https://maven.aliyun.com/repository/gradle-plugin")
//        }
//    }
//}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}
