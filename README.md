# an example to show dependency from platform and exclusion

1. introduce `dependencyManagement` module, add constraints.

    ```kts
    val sentinelVersion = "1.8.6"
    
    dependencies {
        constraints {
            api("com.alibaba.csp:sentinel-spring-webmvc-adapter:$sentinelVersion")
            api("com.alibaba.csp:sentinel-core:$sentinelVersion")
        }
    }
    ```

2. add dependency in `app` module, with exclusion, without version.

    ```kts
    dependencies {
        implementation(enforcedPlatform(project(":dependencyManagement")))
        implementation("com.alibaba.csp:sentinel-spring-webmvc-adapter") {
            exclude("com.alibaba.csp", "sentinel-core")
        }
    }
    ```

3. verify

    ```bash
    $ ./gradlew -q :app:dependencies
    
    ------------------------------------------------------------
    Project ':app'
    ------------------------------------------------------------
    
    runtimeClasspath - Runtime classpath of source set 'main'.
    +--- project :dependencyManagement
    |    \--- com.alibaba.csp:sentinel-spring-webmvc-adapter:1.8.6 (c)
    \--- com.alibaba.csp:sentinel-spring-webmvc-adapter -> 1.8.6
    $ ./gradlew -q run
    Hello, world!
    load adapter success!   com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.UrlCleaner
    load core failed!       java.lang.ClassNotFoundException: com.alibaba.csp.sentinel.Env
    ```

## reference

1. <https://docs.gradle.org/current/userguide/platforms.html#sub:using-platform-to-control-transitive-deps>