// This program calculates the amount of pay that will be contributed to a retirement plan if 5%, 8%, or 10% of monthly pay is withheld.
//Activity-3
public class Activity_3 {
           public static void main(String[]args) {
           double monthlypay = 6000.0;
           double contribution;
   // Calculate and display a 5% contribution.
         contribution = monthlypay * 0.05;
         System.out.println("5 percent is $" + contribution +" per month.");
   // Calculate and display an 8% contribution.
          contribution = monthlypay * 0.08;
          System.out.println("8 percent is $" + contribution + " per month.");
   // Calculate and display a 10% contribution.
          contribution = monthlypay * 0.1;
          System.out.println("10 percent is $" + contribution + " per month.");
        }
       }          

