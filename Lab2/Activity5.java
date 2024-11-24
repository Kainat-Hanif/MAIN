import java.util.*;
public class Activity5 {
   public static void main(String[] args) {
    final double PI = 3.14159;
    Scanner s = new Scanner(System.in);
     System.out.println("Enter a number for radius: ");
     double radius = s.nextDouble();
     double area = radius * radius * PI;
     System.out.println("The area of the circle of radius " + radius + " is " + area);

   }    
}
