//Write a program to input principal, time, and rate (P, T, R)
//from the user and find Simple Interest.
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the Principal amount: ");
        int Principal= in.nextInt();
        System.out.print("Enter the time: ");
        double Time = in.nextDouble();
        System.out.print("Enter the rate in decimal numbers: ");
        double Rate = in.nextDouble();
        double Simple_Interest = (Principal * Time * Rate) / 100;
        System.out.print("Simple Interest=" + " " + Simple_Interest);
    }
}
