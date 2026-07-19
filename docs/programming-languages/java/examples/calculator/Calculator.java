// Simple console calculator
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Java Console Calculator ---");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero.");
                    valid = false;
                }
            }
            default -> {
                System.out.println("Invalid operator!");
                valid = false;
            }
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
