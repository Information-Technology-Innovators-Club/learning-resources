# 🔁 Loops in Java

Loops repeat a block of code while a condition is satisfied.

---

## 1. For Loop (Count-Controlled)
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

## 2. While Loop (Condition-Controlled)
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

## 3. Enhanced For-Each (Array/Collection Iteration)
```java
String[] tools = {"VS Code", "Git", "Docker"};
for (String tool : tools) {
    System.out.println("Tool: " + tool);
}
```
