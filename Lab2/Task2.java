import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int width, length;
        System.out.print("Enter the Width: ");
        width = s.nextInt();
        System.out.print("Enter the Length: ");
        length = s.nextInt();
        int area = length * width;
        int perimeter = 2 * ( length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
