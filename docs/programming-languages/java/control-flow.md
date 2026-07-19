# 🔀 Control Flow in Java

Control flow statements determine which blocks of code execute based on conditions.

---

## 1. Conditional Statements
```java
int score = 85;
if (score >= 90) {
    System.out.println("Grade A");
} else if (score >= 80) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

## 2. Switch Statement (Modern Java 14+ Arrow)
```java
String day = "MONDAY";
switch (day) {
    case "MONDAY", "FRIDAY" -> System.out.println("Weekday");
    case "SATURDAY", "SUNDAY" -> System.out.println("Weekend");
    default -> System.out.println("Invalid day");
}
```
