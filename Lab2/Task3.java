import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1,num2, newNum;
        String name;
        double hoursWorked, wages;
        System.out.print("Enter Num1: ");
        num1 = s.nextInt();
        System.out.print("Enter NUm2: ");
        num2 = s.nextInt();
        System.out.println("The value of Num1 = " + num1);
        System.out.println("The value of Num2 = " + num2);
        newNum = num1 * 2 + num2;
        System.out.println("The value of newNum = " + newNum);
        newNum = newNum + SECRET;
        System.out.println("The updated value of newNum = " + newNum);
        System.out.print("Enter your Last Name: ");
        name = s.next();
        System.out.print("Enter Hours you worked (0-70): ");
        hoursWorked = s.nextDouble();
        wages = RATE * hoursWorked;
        System.out.println("Name = " + name);
        System.out.println("Pay Rate = " + RATE);
        System.out.println("Hours Worked = " + hoursWorked);
        System.out.println("Salary = " + wages);

    }
}
