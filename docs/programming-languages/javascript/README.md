# 🟨 JavaScript Learning Resources

Welcome to the **🟨 JavaScript** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official JavaScript Website](https://developer.mozilla.org/en-US/docs/Web/JavaScript)**
- **[Docs Landing Page](https://developer.mozilla.org/en-US/docs/Web/JavaScript)**

## 📚 Best Free Books & References
- [Eloquent JavaScript](https://eloquentjavascript.net/) — Deep dive into JS syntax, DOM, and Node.js.
- [You Don't Know JS Yet](https://github.com/getify/You-Dont-Know-JS) — Advanced mechanics of closures, scopes, and classes.
- [JavaScript: The Definitive Guide](https://www.oreilly.com/library/view/javascript-the-definitive/9781492054702/) — The reference bible for JS.

---

## 🛠️ Essential Terminal Commands
```bash
    node -v                       # Check Node.js version
    npm init -y                   # Initialize npm package
    npm install <package-name>    # Install dependency
    npm install --save-dev jest   # Install dev dependency
    npm start                     # Run the default app script
```

---

## 💻 Starter Code Snippet
```javascript
// ES6+ Asynchronous JavaScript Example
const fetchUser = async (userId) => {
  try {
    const response = await fetch(`https://jsonplaceholder.typicode.com/users/${userId}`);
    if (!response.ok) throw new Error("User not found");
    const data = await response.json();
    console.log(`User: ${data.name} (${data.email})`);
  } catch (err) {
    console.error(`Error: ${err.message}`);
  }
};

fetchUser(1);

```

---

## 🎯 Practical Exercise Platforms
- [Javascript.info](https://javascript.info/) — Comprehensive language tutorial.
- [Exercism JS Track](https://exercism.org/tracks/javascript) — Coding practice challenges.
- [CodeWars JS](https://www.codewars.com/) — Fun coding challenges to level up skills.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
