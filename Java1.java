import java.util.*; 

public class Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(x);
        int y,z;
        System.out.println("Enter 2 integers: ");
        y= sc.nextInt();
        z= sc.nextInt();
        int a = y+z;
        System.out.println("Sum of the 2 given numbers is: "+a);
        sc.useRadix(2);
        int b=sc.nextInt();
        System.out.println(b);
    }
}
