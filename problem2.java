//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String name = in.nextLine();
        System.out.println("Hello"+ " " + name + "," +" " +"How are you?");

    }
}
