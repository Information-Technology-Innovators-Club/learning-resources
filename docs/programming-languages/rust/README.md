# 🦀 Rust Learning Resources

Welcome to the **🦀 Rust** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official Rust Website](https://www.rust-lang.org/)**
- **[Docs Landing Page](https://www.rust-lang.org/)**

## 📚 Best Free Books & References
- [The Rust Programming Language](https://doc.rust-lang.org/book/) — The official guide.
- [Rust in Action](https://www.manning.com/books/rust-in-action) — Systems coding patterns.
- [Programming Rust](https://www.oreilly.com/library/view/programming-rust-2nd/9781492052586/) — Master memory management.

---

## 🛠️ Essential Terminal Commands
```bash
    rustc --version               # Check compiler version
    cargo new myapp               # Create binary cargo application
    cargo build --release         # Compile with full optimizations
    cargo run                     # Compile and execute binary
    cargo test                    # Run tests package-wide
```

---

## 💻 Starter Code Snippet
```rust
// Rust Struct & Ownership Pattern Example
struct Developer {
    name: String,
    language: String,
}

fn main() {
    let dev = Developer {
        name: String::from("Praise"),
        language: String::from("Rust"),
    };

    println!("{} builds systems in {}.", dev.name, dev.language);
}

```

---

## 🎯 Practical Exercise Platforms
- [Rustlings](https://github.com/rust-lang/rustlings) — Local interactive syntax exercises.
- [Rust Playground](https://play.rust-lang.org/) — Compile code in browser.
- [Exercism Rust Track](https://exercism.org/tracks/rust) — Mentored programming.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
