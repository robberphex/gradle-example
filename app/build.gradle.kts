plugins {
    id("application")
}

application {
    mainClass = "com.example.Hello"
}

dependencies {
    implementation(enforcedPlatform(project(":dependencyManagement")))
    implementation("com.alibaba.csp:sentinel-spring-webmvc-adapter") {
        exclude("com.alibaba.csp:sentinel-core")
    }
}
