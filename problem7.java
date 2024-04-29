//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class problem7 {
    public static void main(String[] args) {
        // Taking input for the number of Fibonacci numbers to be generated
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers: ");
        int n = scanner.nextInt();
        scanner.close();

        int first = 0, second = 1;

        // Printing the first two Fibonacci numbers
        System.out.println("Fibonacci Series up to " + n + " numbers:");
        System.out.print(first + " " + second + " ");

        // Generating Fibonacci series up to n numbers
        for (int i = 2; i < n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
