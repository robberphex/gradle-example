plugins {
    base
    id("jacoco-report-aggregation")
}

repositories {
    maven {
        url = uri("https://maven.aliyun.com/repository/central")
    }
}

dependencies {
    jacocoAggregation(project(":app"))
    jacocoAggregation(project(":app1"))
}

reporting {
    reports {
        val testCodeCoverageReport by creating(JacocoCoverageReport::class) {
            testType = TestSuiteType.UNIT_TEST
        }
    }
}

tasks.check {
    dependsOn(tasks.named<JacocoReport>("testCodeCoverageReport"))
}
