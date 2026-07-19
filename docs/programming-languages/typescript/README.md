# 🟦 TypeScript Learning Resources

Welcome to the **🟦 TypeScript** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official TypeScript Website](https://www.typescriptlang.org/)**
- **[Docs Landing Page](https://www.typescriptlang.org/)**

## 📚 Best Free Books & References
- [Programming TypeScript](https://www.oreilly.com/library/view/programming-typescript/9781492037958/) — Learn compiler details, types, and architecture.
- [Effective TypeScript](https://effectivetypescript.com/) — 62 specific ways to improve your TypeScript code.
- [Tackling TypeScript](https://exploringjs.com/tackling-ts/) — Practical, hands-on TypeScript manual.

---

## 🛠️ Essential Terminal Commands
```bash
    npm install -g typescript     # Install compiler globally
    tsc --init                    # Create tsconfig.json config
    tsc                           # Compile TS to JS files
    ts-node src/index.ts          # Run TS files directly
    tsc -w                        # Compile in watch mode
```

---

## 💻 Starter Code Snippet
```javascript
// TypeScript Interface and Generics Example
interface User<T> {
  id: number;
  name: string;
  meta: T;
}

function printUserInfo<T>(user: User<T>): void {
  console.log(`ID: ${user.id}, Name: ${user.name}`);
  console.log("Metadata:", user.meta);
}

const developer: User<{ languages: string[] }> = {
  id: 42,
  name: "Praise",
  meta: { languages: ["TS", "Go", "Python"] }
};

printUserInfo(developer);

```

---

## 🎯 Practical Exercise Platforms
- [TS Playground](https://www.typescriptlang.org/play) — Test TypeScript syntax online.
- [Type Hero](https://typehero.dev/) — Interactive TypeScript type-system puzzles.
- [TypeScript Deep Dive](https://basarat.gitbook.io/typescript/) — Best free guide online.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
