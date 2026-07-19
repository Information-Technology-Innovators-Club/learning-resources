# 🔤 Strings in Java

In Java, strings are objects representing sequences of characters. Strings are **immutable** (cannot be modified once allocated).

---

## 📦 String Manipulation
- **String Pool**: Java stores literal strings in a specific memory area to optimize storage.
- **StringBuilder**: Use for efficient string modifications in single-threaded environments.
- **StringBuffer**: Thread-safe alternative to StringBuilder.

```java
String str = "Hello";
str = str + " World"; // Creates a new String object!

StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");   // Modifies original buffer memory.
System.out.println(sb.toString());
```
