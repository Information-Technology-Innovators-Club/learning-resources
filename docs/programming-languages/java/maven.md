# 📦 Apache Maven Build Tool

Maven is a build automation tool used primarily for Java projects to manage library dependencies and lifecycles.

---

## 📄 Pom.xml Configuration
The Project Object Model (POM) XML holds configuration details for building the application:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <modelVersion>4.0.0</modelVersion>
    <groupId>org.itic</groupId>
    <artifactId>learning-app</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- Adding Postgres Driver -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.6.0</version>
        </dependency>
    </dependencies>
</project>
```
