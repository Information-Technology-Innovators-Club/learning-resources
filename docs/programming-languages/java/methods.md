# ⚙️ Methods in Java

A method is a block of code that executes only when called. It helps modularize logic.

---

## 💻 Method Structure
```java
public class MethodDemo {
    // Access Modifier, Return Type, Name, Parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
    }
}
```

### Method Overloading
Declaring multiple methods with the same name but different parameters:
```java
int add(int a, int b) { return a + b; }
double add(double a, double b) { return a + b; }
```
