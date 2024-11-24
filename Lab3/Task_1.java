//Suppose you want to develop a program that changes a given amount of money into smaller monetary units. The program lets the user enter an amount as a double value representing a total in dollars and cents, and outputs a report listing the monetary equivalent in the maximum number of dollars, quarters, dimes, nickels, and pennies, in this order, 
//to result in the minimum number of coins
//Here are the steps in developing the program:
//1. Prompt the user to enter the amount as a decimal number, such as 11.56.
// 2. Convert the amount (e.g., 11.56) into cents (1156).
// 3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents 
// remainder 100.
// 4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents 
// using the remaining cents remainder 25.
// 5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using 
// the remaining cents remainder 10.
// 6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining cents using 
// the remaining cents remainder 5.
// 7. The remaining cents are the pennies.
// 8. Display the result.
// You are required to implement the above steps 1-8 in JAVA language
// import java .util.Scanner;
// public class Task_1 {
//     static Scanner s = new Scanner(System.in);
//     public static void main(String[]args) {
//          double a;
//     // 1.Enter the amount.
//              System.out.println("Enter a numebr: ");
//              a = s.nextDouble();

//     // 2.Convert the amount into cents.
//          int TotalCents = (int) Math.round(a * 100);
         
//     // 3.Calculate the number of dollars.
    
//          int dollars = TotalCents / 100;
//          int remainingCents = TotalCents % 100;

//     // 4.Calculate the number of quarters

//          int quarters =remainingCents /25;
//          remainingCents = remainingCents % 25;

//     // 5.Calculate the number of dimes
        
//          int dimes = remainingCents / 10;
//          remainingCents = remainingCents % 10;

//     // 6.Calculate the number of nickels

//          int nickels = remainingCents / 5;
//          remainingCents = remainingCents % 5;

//     // 7.The remaining cents are the pennies

//          int pennies = remainingCents;

//     // 8.Displaying the result

//              System.out.println("Your amount " + a + "consists of:");
//              System.out.println(" Dollars: " + dollars);
//              System.out.println(" Quarters: " + quarters);
//              System.out.println(" Dimes: " + dimes);
//              System.out.println(" Nickels: " + nickels);
//              System.out.println(" Pennies: " + pennies);
//     }
// }






////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
public class Task_1 {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the number (eg. 18.29)");
          double num = s.nextDouble();
     // For the Dollars
          num = num * 100;
          int dollars = (int) num / 100;
          num = num % 100;

     // for cents    
        num = num % 100; 
          int cents = (int) num % 100;
          int quarters = cents / 25;
          

     }
}