# 💾 File Handling in Java

Java provides utility classes to create, read, update, and delete files.

---

## 📝 Reading and Writing (Try-with-Resources)
```java
import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("log.txt");

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Welcome to CUT ITIC");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
