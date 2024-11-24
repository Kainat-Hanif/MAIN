// This program calculates hourly wages plus overtime.
//Activity-2
public class Activity_2 {
     public static void main(String[]args) {
       //Initializing the values to the variables
        double regularwages;
        double basepay = 25;
        double regularhours = 40;
        double overtimewages;
        double overtimepay = 37.5;
        double overtimehours = 10;
        double totalwages;
     //Calculations
        regularwages = basepay * regularhours;
        overtimewages = overtimepay * overtimehours;
        totalwages = regularwages + overtimewages;
     //Results
          System.out.println("Wages for the week are $" + totalwages);
    }    
}
 
