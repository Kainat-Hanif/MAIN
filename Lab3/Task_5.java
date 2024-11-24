//A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a local grocery store. The cost of producing one liter of milk is $0.38, and the profit of each carton of milk is $0.27. Write a program that does the following:
// a. Prompts the user to enter the total amount of milk produced in the morning
// b. Outputs the number of milk cartons needed to hold milk (Round your answer to the nearest integer.)
// c. Outputs the cost of producing milk
// d. Outputs the profit for producing milk
import java.util.Scanner;
public class Task_5 {
     static Scanner s = new Scanner(System.in);
     public static void main(String[]args) {
    // Constants
         final double Carton_Capacity = 3.78;  // Liters per carton
         final double Cost_Per_Liter = 0.38;     // Cost to produce one liter
         final double Profit_Per_Carton = 0.27;    // Profit per carton
       
    // Prompt the user for the total amount of milk produced
         System.out.print("Enter the total amount of milk produced in liters: ");
         double totalmilk = s.nextDouble();
       
    // Calculate the number of milk cartons needed (rounded to the nearest integer)
         int CartonsNeeded = (int) Math.round(totalmilk / Carton_Capacity);
       
    // Calculate the cost of producing the milk
         double totalCost = totalmilk * Cost_Per_Liter;
       
    // Calculate the profit from producing the milk
         double totalProfit = CartonsNeeded * Profit_Per_Carton;
       
    // Output the results
             System.out.println("Number of milk cartons needed: " + CartonsNeeded);
             System.out.printf("Cost of producing the milk: " + totalCost + "$" );
             System.out.printf("Profit from producing the milk: " + totalProfit + "$" ); 
    }
    
}
