//N students take K apples and distribute them among each other evenly. The remaining (the undivisible) 
//part remains in the basket. How many apples will each single student get? How many apples will remain in the basket?
//The program reads the numbers N and K. It should print the two answers for the questions above.
import java.util.Scanner;
public class Task_2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[]args) {
         int N,K;      //N are the students & K are the apples
    //Taking the students(N) input from the user.
             System.out.println("Enter how many students (N): ");
             N = s.nextInt();
    //Taking the Apples (K) input from the user.         
             System.out.println("Enter the amount of apples (K) ");
             K = s.nextInt();

    // Displaying the result.
              int appleperstudent = K / N;
              int remainingapples = K % N;              
              System.out.println("Each student gets " + appleperstudent + " apples." );
              System.out.println("Apples remaining in the basket: " + remainingapples + " remainingapples.");
    }
    
}
