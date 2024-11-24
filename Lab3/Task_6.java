//You found an exciting summer job for five weeks. It pays $15.50 per hour. Suppose that the total tax you 
// pay on your summer job income is 14%. After paying the taxes, you spend 10% of your net income to buy 
// new clothes and other accessories for the next school year and 1% to buy school supplies. After buying 
// clothes and school supplies, you use 25% of the remaining money to buy savings bonds. For each dollar 
// you spend to buy savings bonds, your parents spend $0.50 to buy additional savings bonds for you. Write 
// a program that prompts the user to enter the pay rate for an hour and the number of hours you worked 
// each week. The program then outputs the following:
// a. Your income before and after taxes from your summer job
// b. The money you spend on clothes and other accessories
// c. The money you spend on school supplies
// d. The money you spend to buy savings bonds
// e. The money your parents spend to buy additional savings bonds for you
import java.util.Scanner;
public class Task_6 {
    static Scanner s= new Scanner(System.in);
         public static void main(String[]args) {
    //Enter the payrate by the user
         System.out.print("Enter hourly pay rate: $");
         double pay = s.nextDouble();
    //Enter number of hours you have worked
         System.out.print("Enter total hours worked: ");
         int hours = s.nextInt();
        //Calculate the gross income value
             double gross = pay * hours;
             double net = gross * 0.86; // 100% - 14% taxes
             double savings = net * 0.25 * 0.9; // 25% of 90% remaining
             double parents = savings * 0.50;

                 System.out.println("\nResults:");
                 System.out.printf("Gross Income: $%.2f%n", gross);
                 System.out.printf("Net Income: $%.2f%n", net);
                 System.out.printf("Savings Bonds: $%.2f%n", savings);
                 System.out.printf("Parents' Contribution: $%.2f%n", parents);
    }
}
