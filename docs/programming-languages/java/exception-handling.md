# ⚠️ Exception Handling in Java

Exceptions are events that disrupt the normal flow of instructions.

---

## 💻 Try-Catch Syntax
```java
try {
    int division = 10 / 0; // Throws ArithmeticException
} catch (ArithmeticException e) {
    System.err.println("Cannot divide by zero: " + e.getMessage());
} finally {
    System.out.println("This block always executes.");
}
```

### Checked vs Unchecked
- **Checked Exceptions**: Checked at compile-time (e.g., `IOException`). Must be declared or handled.
- **Unchecked Exceptions**: Occur at runtime (e.g., `NullPointerException`).
