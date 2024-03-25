plugins {
    id("myproject.java-conventions")
    application
}

application {
    mainClass = "com.example.Hello"
}

dependencies {
    implementation(platform(project(":dependencyManagement")))
    implementation("com.alibaba.csp:sentinel-spring-webmvc-adapter") {
        exclude("com.alibaba.csp", "sentinel-core")
    }
}
