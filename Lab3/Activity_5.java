//This program displays the sales tax with two digits after the decimal point.
import java.util.Scanner;
public class Activity_5 {
    public static void main(String[]args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter purchase amount: ");
        double purchaseAmount = s.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100)/ 100.0);
    }
}
