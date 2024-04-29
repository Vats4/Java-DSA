//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1= ");
        double num1= scanner.nextDouble();
        System.out.print("Enter number2= ");
        double num2= scanner.nextDouble();

        if (num1>num2) {
            System.out.print(num1 + " is larger ");
        }
        else if (num2>num1) {
            System.out.print(num2 + " is larger ");
        }
        else if (num1==num2) {
            System.out.println("num1 and num2 are equal.");
        }

    }
}
