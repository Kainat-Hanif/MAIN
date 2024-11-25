import java.util.*;
public class Practice {
    
    public static int addTheNumber(int a, int b ) {
        int x =0;
        x = a + b;
        return x;
     }
    public static void addTheNumber(double a, int b) {
        double c =0;
        c = a + b;
        return;
    }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Enter a 1st number: ");        
       int a = s.nextInt();
       System.out.println("Enter a 2nd number: ");
       int b =s.nextInt();
       System.out.println("The addition between " + a + " and " + b + " is " + addTheNumber(a, b));
       System.out.println("Enter the decimal number: ");
       double g = s.nextDouble();
       System.out.println("Enter the integer number: ");
       int h = s.nextInt();
       System.out.println("The addition between the other two numbers is " + addTheNumber(a, b));
    }
}
