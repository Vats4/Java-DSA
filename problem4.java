//Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        // Perform the operation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Check if dividing by zero
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero!");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Error: Invalid operator!");
            return;
        }

        // Output the result
        System.out.println("Result: " + result);
    }
}


