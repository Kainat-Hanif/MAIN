//Write JAVA statements using System.out.prinf() statement 
//to display output as given below
public class Task_10 {
    public static void main(String[] args) {
    // Display the header of the table
         System.out.printf("%-10s %-8s %-5s %-6s %-7s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

    // Display data for 30 degrees
          int degrees = 30;
          double radians = Math.toRadians(degrees);
          double sin = Math.sin(radians);
          double cos = Math.cos(radians);
          double tan = Math.tan(radians);
             System.out.printf("%-10d %-8.4f %-5.4f %-6.4f %-7.4f\n", degrees, radians, sin, cos, tan);

    // Display data for 60 degrees
          degrees = 60;
          radians = Math.toRadians(degrees);
          sin = Math.sin(radians);
          cos = Math.cos(radians);
          tan = Math.tan(radians);
             System.out.printf("%-10d %-8.4f %-5.4f %-6.4f %-7.4f\n", degrees, radians, sin, cos, tan);

    }
}