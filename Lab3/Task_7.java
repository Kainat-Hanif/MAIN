//A cricket game is to be held in a stadium and there are four seating categories available for the audience. 
//Class A seats cost $20, Class B seats cost $15, Class C seats cost $10, and Class D seats cost $5. 
//You should write a JAVA program that asks how many tickets for each class of seats were sold and 
//finally display the total income generated and income corresponding to ticket sales.
import java.util.Scanner;
public class Task_7 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Class A tickets sold: ");
        int a = s.nextInt() * 20;
        System.out.print("Class B tickets sold: ");
        int b = s.nextInt() * 15;
        System.out.print("Class C tickets sold: ");
        int c = s.nextInt() * 10;
        System.out.print("Class D tickets sold: ");
        int d = s.nextInt() * 5;

        int total = a + b + c + d;

        System.out.println("\nResults:");
        System.out.println("Class A: $" + a);
        System.out.println("Class B: $" + b);
        System.out.println("Class C: $" + c);
        System.out.println("Class D: $" + d);
        System.out.println("Total: $" + total);

    }
    
}
