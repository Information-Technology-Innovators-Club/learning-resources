# 🐘 Gradle Build Tool

Gradle is a high-performance build automation tool that supports building Java packages using a domain-specific Groovy or Kotlin DSL.

---

## 📄 build.gradle Configuration
```groovy
plugins {
    id 'java'
}

group = 'org.itic'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.postgresql:postgresql:42.6.0'
    testImplementation 'org.junit.jupiter:junit-jupiter:5.9.2'
}

test {
    useJUnitPlatform()
}
```
