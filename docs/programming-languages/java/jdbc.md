# 🗄️ Java Database Connectivity (JDBC)

JDBC is the Java API used to connect and execute queries against relational databases.

---

## 💻 Connection & Query Example
```java
import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/itic_db";
        String user = "postgres";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM members");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("Member: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```
