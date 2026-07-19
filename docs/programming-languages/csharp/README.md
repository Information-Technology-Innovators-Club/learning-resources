# 💜 C# Learning Resources

Welcome to the **💜 C#** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official C# Website](https://learn.microsoft.com/en-us/dotnet/csharp/)**
- **[Docs Landing Page](https://learn.microsoft.com/en-us/dotnet/csharp/)**

## 📚 Best Free Books & References
- [C# in Depth](https://www.manning.com/books/c-sharp-in-depth-fourth-edition) — Learn features from C# 5 to C# 8.
- [Pro C# 10 with .NET 6](https://link.springer.com/book/10.1007/978-1-4842-7869-7) — Enterprise development tutorial.
- [Clean Architecture in .NET](https://jasontaylor.dev/) — Best practices for ASP.NET API designs.

---

## 🛠️ Essential Terminal Commands
```bash
    dotnet --version             # Check .NET SDK version
    dotnet new webapi -o MyApp   # Create Web API project
    dotnet run                   # Run current .NET application
    dotnet build                 # Compile project files
    dotnet test                  # Execute testing suites
```

---

## 💻 Starter Code Snippet
```dart
// Modern C# LINQ & Record Example
using System;
using System.Collections.Generic;
using System.Linq;

public record Member(string Name, int Points);

class Program {
    static void Main() {
        var members = new List<Member> {
            new Member("Alice", 120),
            new Member("Bob", 90),
            new Member("Charlie", 150)
        };

        var highScorers = members.Where(m => m.Points > 100).OrderByDescending(m => m.Points);

        foreach (var m in highScorers) {
            Console.WriteLine($"{m.Name} is a top builder with {m.Points} points.");
        }
    }
}

```

---

## 🎯 Practical Exercise Platforms
- [Microsoft Learn C#](https://learn.microsoft.com/en-us/training/paths/get-started-c-sharp-part-1/) — Free official courses.
- [C# Pad](https://csharppad.com/) — Web interactive compiler.
- [Exercism C# Track](https://exercism.org/tracks/csharp) — Practical coding.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
