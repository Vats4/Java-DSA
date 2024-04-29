//Input currency in CAD and output in USD.
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the amount in CAD: ");
        double cad= scanner.nextDouble();
        double usd= cad * 0.73;
        System.out.println("CAD" + "$" + cad + " =" + " $" +usd + "USD");

    }


}
