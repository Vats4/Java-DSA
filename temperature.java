// Converting temperature from celsius to fahrenheit

import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter a Temperature: ");

        float tempC = in.nextFloat();
        float tempF= (tempC * 9/5) + 32;
        System.out.println(tempF);
    }

}
