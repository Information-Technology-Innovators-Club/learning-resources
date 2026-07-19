// Student Management using ArrayList
import java.util.*;

public class StudentSystem {
    public record Student(int id, String name, double grade) {}

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 92.5));
        students.add(new Student(2, "Bob", 81.0));

        System.out.println("=== Student Directory ===");
        for (Student s : students) {
            System.out.println("ID: " + s.id() + " | Name: " + s.name() + " | Grade: " + s.grade());
        }
    }
}
