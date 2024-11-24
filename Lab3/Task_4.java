//Given the integer N – the number of minutes that is passed since midnight - how many hours and minutes are displayed on the 24h digital clock?
//The program should print two numbers: the number of hours (between 0 and 23) and the number of minutes (between 0 and 59).
//For example, if N = 150, then 150 minutes have passed since midnight - i.e. now is 2:30 am. So the program should print 2 30.
import java.util.Scanner;
public class Task_4 {
    static Scanner s= new Scanner(System.in);
    public static void main(String[]args) {
         int hours,minutes;
    // Reading the number of minutes since midnight
         System.out.print("Enter the number of minutes since midnight: ");
         int N = s.nextInt();
        
    // Calculating the hours and minutes
              hours = (N / 60) % 24;           // Get hours within 0-23 range
              minutes = N % 60;               // Get minutes within 0-59 range
        
    // Display the result
              System.out.println("Hours are: "+ hours + " \n" + "Minutes are: " + minutes);
    }
    
}
