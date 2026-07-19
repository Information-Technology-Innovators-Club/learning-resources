# 🐹 Go Learning Resources

Welcome to the **🐹 Go** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official Go Website](https://go.dev/)**
- **[Docs Landing Page](https://go.dev/)**

## 📚 Best Free Books & References
- [The Go Programming Language](https://www.gopl.io/) — Authoritative guide to Go semantics.
- [Learning Go](https://www.oreilly.com/library/view/learning-go/9781492077206/) — Idiomatic Go guides for developers.
- [Go Web Programming](https://www.manning.com/books/go-web-programming) — Design APIs and templates in Go.

---

## 🛠️ Essential Terminal Commands
```bash
    go version                    # Check installed compiler
    go mod init myapp             # Initialize Go Module config
    go get <dependency-url>       # Fetch package dependency
    go build -o app               # Compile code to static binary
    go run main.go                # Compile and run immediately
```

---

## 💻 Starter Code Snippet
```go
package main

import (
	"fmt"
	"sync"
)

func main() {
	var wg sync.WaitGroup
	wg.Add(2)

	go func() {
		defer wg.Done()
		fmt.Println("Goroutine 1 executed")
	}()

	go func() {
		defer wg.Done()
		fmt.Println("Goroutine 2 executed")
	}()

	wg.Wait()
	fmt.Println("Both executed successfully")
}

```

---

## 🎯 Practical Exercise Platforms
- [A Tour of Go](https://go.dev/tour/) — Interactive syntax guide.
- [Go by Example](https://gobyexample.com/) — Practical code examples.
- [Exercism Go Track](https://exercism.org/tracks/go) — Coding challenges.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
