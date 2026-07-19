# 🐍 Python Learning Resources

Welcome to the **🐍 Python** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official Python Website](https://docs.python.org/3/)**
- **[Docs Landing Page](https://docs.python.org/3/)**

## 📚 Best Free Books & References
- [Automate the Boring Stuff with Python](https://automatetheboringstuff.com/) — A practical guide for beginners to write scripts and automate tasks.
- [Think Python](https://greenteapress.com/wp/think-python-2e/) — A great introduction to Python and computer science concepts.
- [Fluent Python](https://www.oreilly.com/library/view/fluent-python-2nd/9781492056348/) — Best book for mastering advanced features and clean code.

---

## 🛠️ Essential Terminal Commands
```bash
    python --version           # Check Python version
    python -m venv .venv       # Create virtual environment
    source .venv/bin/activate  # Activate (macOS/Linux)
    .venv\Scripts\activate    # Activate (Windows)
    pip install -r requirements.txt # Install dependencies
```

---

## 💻 Starter Code Snippet
```python
# Python Type Hinting & OOP Example
from typing import List

class Student:
    def __init__(self, name: str, grades: List[float]):
        self.name = name
        self.grades = grades

    def get_average(self) -> float:
        return sum(self.grades) / len(self.grades) if self.grades else 0.0

# Usage
student = Student("Alice", [90.0, 85.5, 95.0])
print(f"{student.name}'s Average: {student.get_average():.2f}")

```

---

## 🎯 Practical Exercise Platforms
- [Exercism Python Track](https://exercism.org/tracks/python) — Mentored programming exercises.
- [Python LeetCode Tasks](https://leetcode.com/problemset/all/) — Algorithm problem solving.
- [Real Python](https://realpython.com/) — High-quality tutorials and video guides.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
