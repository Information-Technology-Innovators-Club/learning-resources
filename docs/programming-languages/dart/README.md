# 🎯 Dart Learning Resources

Welcome to the **🎯 Dart** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official Dart Website](https://dart.dev/)**
- **[Docs Landing Page](https://dart.dev/)**

## 📚 Best Free Books & References
- [Dart Apprentice](https://www.kodeco.com/books/dart-apprentice) — Master fundamentals.
- [Flutter in Action](https://www.manning.com/books/flutter-in-action) — Built-in Dart architecture concepts.
- [Dart in Action](https://www.manning.com/books/dart-in-action) — Complete guide.

---

## 🛠️ Essential Terminal Commands
```bash
    dart --version                 # Check Dart SDK version
    dart create -t console-full app # Create console application
    dart run                       # Run project startup script
    dart compile exe bin/main.dart # Compile to target binary
    dart pub get                   # Install pub dependencies
```

---

## 💻 Starter Code Snippet
```dart
// Dart Null-Safe OOP Example
class User {
  final String name;
  final String? email; // Nullable type

  User(this.name, {this.email});

  void display() {
    print("User: $name, Email: ${email ?? 'No email provided'}");
  }
}

void main() {
  var dev = User("Praise Masunga", email: "praise@itic.org");
  dev.display();
}

```

---

## 🎯 Practical Exercise Platforms
- [DartPad](https://dartpad.dev/) — Interactive editor online.
- [Dart Codelabs](https://dart.dev/codelabs) — Guided learning routes.
- [Exercism Dart Track](https://exercism.org/tracks/dart) — Practical programming.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
