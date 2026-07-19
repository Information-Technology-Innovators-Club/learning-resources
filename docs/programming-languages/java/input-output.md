# 🔌 Input & Output in Java

Learn to read user inputs from the console and output formatted messages back.

---

## 📥 Reading Input (Scanner Class)
```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();
    }
}
```

## 📤 Outputting Data
- `System.out.print()`: Outputs without newline.
- `System.out.println()`: Outputs with a trailing newline.
- `System.out.printf()`: Formats string values (e.g. `%.2f` for float decimal caps).
