# 📚 Java Collections Framework

The Collection Framework provides interfaces and classes to handle groups of objects dynamically (resizing array blocks).

---

## 🏷️ Key Interfaces & Implementations

| Interface | Main Features | Implementation |
| :--- | :--- | :--- |
| **List** | Ordered, permits duplicate values | `ArrayList`, `LinkedList` |
| **Set** | Unordered, unique values only | `HashSet`, `TreeSet` |
| **Map** | Key-Value pairs, unique keys | `HashMap`, `TreeMap` |

```java
import java.util.*;

List<String> list = new ArrayList<>();
list.add("Java");

Map<String, String> map = new HashMap<>();
map.put("role", "developer");
```
