
plugins {
    `java-platform`
}

val sentinelVersion = "1.8.7"

dependencies {
    constraints {
        api("com.alibaba.csp:sentinel-core:$sentinelVersion")
        api("com.alibaba.csp:sentinel-traffic:$sentinelVersion")
        api("com.alibaba.csp:sentinel-parameter-flow-control:$sentinelVersion")
        api("com.alibaba.csp:sentinel-dynamic-setting-extension:$sentinelVersion")
        api("com.alibaba.csp:sentinel-datasource-extension:$sentinelVersion")
    }
}
