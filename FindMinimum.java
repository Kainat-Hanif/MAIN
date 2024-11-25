public class FindMinimum {
   public static int mini(int[] a) {
        int mini = a[0];
        for(int i=0; i < a.length ; i++) {
            if(a[i] < mini) 
            mini = a[i];
        }
        return mini;
    }
    public static void main(String[] args) {
    int [] y = {5,10,20};      
        int b = mini(y);
        System.out.println("The minimum is: " + mini(y));
    }
}
