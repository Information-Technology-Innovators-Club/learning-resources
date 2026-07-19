# ⚡ C++ Learning Resources

Welcome to the **⚡ C++** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official C++ Website](https://en.cppreference.com/)**
- **[Docs Landing Page](https://en.cppreference.com/)**

## 📚 Best Free Books & References
- [A Tour of C++](https://isocpp.org/tour) — Quick overview by creator Bjarne Stroustrup.
- [Effective Modern C++](https://www.oreilly.com/library/view/effective-modern-c/9781491908419/) — 42 guidelines for modern C++11/14.
- [C++ Primer](https://www.oreilly.com/library/view/c-primer-fifth/9780133053043/) — Solid tutorial for standard C++ features.

---

## 🛠️ Essential Terminal Commands
```bash
    g++ --version                 # Check GCC compiler version
    g++ -std=c++20 main.cpp -o app # Compile source code using C++20
    ./app                         # Run compiled binary
    cmake -B build                # Generate makefiles with CMake
    cmake --build build           # Compile the CMake build target
```

---

## 💻 Starter Code Snippet
```cpp
// Modern C++ Smart Pointers & STL Example
#include <iostream>
#include <memory>
#include <vector>
#include <algorithm>

struct Player {
    std::string name;
    int score;
};

int main() {
    auto player = std::make_unique<Player>(Player{"Praise", 999});
    std::vector<int> numbers = {3, 1, 4, 1, 5, 9};
    std::sort(numbers.begin(), numbers.end());

    std::cout << "Player: " << player->name << " score: " << player->score << "\n";
    std::cout << "Sorted: ";
    for (int n : numbers) std::cout << n << " ";
    std::cout << "\n";
    return 0;
}

```

---

## 🎯 Practical Exercise Platforms
- [LearnCpp.com](https://www.learncpp.com/) — Outstanding tutorial database.
- [CppCon Youtube](https://www.youtube.com/user/CppCon) — Industry best talks.
- [Exercism C++ Track](https://exercism.org/tracks/cpp) — Practical challenges.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
