# 📦 Variables & Scope in Java

A variable is a container that holds data during the execution of a Java program.

---

## 🏷️ Variable Categories

1. **Local Variables**: Declared inside a method. Accessible only within that method.
2. **Instance Variables**: Declared inside a class but outside methods. Accessible by creating class instances.
3. **Static Variables**: Declared with the `static` keyword. Shared across all instances of the class.

```java
public class VariableDemo {
    public static int globalCount = 0; // Static variable
    public String name = "ITIC";      // Instance variable

    public void run() {
        double score = 95.5;          // Local variable
        System.out.println(score);
    }
}
```
