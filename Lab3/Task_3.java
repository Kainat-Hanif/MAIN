//A school decided to replace the desks in three classrooms. Each desk sits two students. Given the number 
// of students in each class, print the smallest possible number of desks that can be purchased.
// The program should read three integers: the number of students in each of the three 
// classes, a, b and c respectively.
import java.util.Scanner;
public class Task_3 {
     static Scanner s = new Scanner(System.in);
     public static void main(String[]args) {
    // Reading the number of students in each class 
         System.out.print("Enter number of Students from Class A: ");
         int a = s.nextInt();

         System.out.print("Enter number of Students from Class B: ");
         int b = s.nextInt();

         System.out.print("Enter number of Students from Class C: ");
         int c = s.nextInt();

    //Calculating the number of desks that are needed for each of these class
          int desksforClassA = (a+1)/2;
          int desksforClassB = (b+1)/2;
          int desksforClassC = (c+1)/2;

    //Calculating the total number of desks that are needed
          int totaldesks = desksforClassA + desksforClassB + desksforClassC;

    //Displaying the result
          System.out.println("The smallest possible number of desks needed are: " + totaldesks);
     }
    
}
