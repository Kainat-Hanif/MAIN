//Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
//For example, if an integer is 932, the sum of all its digits is 14.
// Enter a number between 0 and 1000: 999
// The sum of the digits is 27
import java.util.*;
public class Task_8 {
       static Scanner s = new Scanner(System.in);
         public static void main(String[]args) {
    //Taking an integer number from the user
         System.out.print("Enter an integer number from (0 to 1000): ");
         int num = s.nextInt();
             int sum = 0;
             while (num > 0)  {                      
                sum = sum + num % 10;    //gets the last number inputed by the user
                num = num /10;         // removes the last digit 
             }
             System.out.println("The sum of digits is " + sum);
       }    
}
