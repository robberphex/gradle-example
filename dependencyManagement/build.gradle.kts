
plugins {
    `java-platform`
}

val sentinelVersion = "1.8.6"

dependencies {
    constraints {
        api("com.alibaba.csp:sentinel-spring-webmvc-adapter:$sentinelVersion")
    }
}
