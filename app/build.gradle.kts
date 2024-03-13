plugins {
    id("application")
}

application {
    mainClass = "com.example.Hello"
}

dependencies {
    implementation(platform("com.alibaba.csp:sentinel-parameter-flow-control")) {
        exclude("com.alibaba.middleware", "metrics-integration")
    }
}

