# ☕ Java Learning Resources

Welcome to the **☕ Java** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official Java Website](https://docs.oracle.com/en/java/)**
- **[Docs Landing Page](https://docs.oracle.com/en/java/)**

## 📚 Best Free Books & References
- [Effective Java](https://www.oreilly.com/library/view/effective-java/9780134686097/) — Absolute must-read for Java developers.
- [Java: A Beginner's Guide](https://www.oracle.com/academic/resources.html) — Structured learning pathway.
- [Head First Java](https://www.oreilly.com/library/view/head-first-java/9781492091615/) — Visually rich, fun guide for starting.

---

## 🛠️ Essential Terminal Commands
```bash
    java -version                 # Check installed JRE
    javac Main.java               # Compile Java source code
    java Main                     # Execute compiled bytecode
    ./mvnw clean package          # Build maven project
    ./gradlew build               # Build gradle project
```

---

## 💻 Starter Code Snippet
```java
// Modern Java record and streams example
import java.util.List;

public class Main {
    public record Developer(String name, List<String> skills) {}

    public static void main(String[] args) {
        List<Developer> team = List.of(
            new Developer("Praise", List.of("Java", "Go")),
            new Developer("Sarah", List.of("Flutter", "Dart"))
        );

        team.stream()
            .filter(d -> d.skills().contains("Java"))
            .forEach(d -> System.out.println(d.name() + " knows Java."));
    }
}

```

---

## 🎯 Practical Exercise Platforms
- [Exercism Java Track](https://exercism.org/tracks/java) — Practical exercises.
- [LeetCode Java Problems](https://leetcode.com/) — Core data structures algorithms.
- [Hyperskill by JetBrains](https://hyperskill.org/) — Project-based learning platform.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
