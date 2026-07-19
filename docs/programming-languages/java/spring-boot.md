# 🍃 Spring Boot Enterprise Services

Spring Boot is an extension of the Spring framework that simplifies configuring REST APIs and enterprise web services.

---

## 💻 Simple REST Controller
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/members")
public class Application {

    @GetMapping
    public String getMember() {
        return "Hello ITIC Spring Developer!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```
