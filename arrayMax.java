
import java.util.Scanner;

public class arrayMax {
    
    static int Max(int A[]){
        int m = A[0];
        for (int i = 0; i < A.length; i++) {
            if(A[i]>m)
            m = A[i];            
        }
        return m;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int x[]=new int[n];
        for (int i = 0; i <n; i++) {
            x[i]=sc.nextInt();
        }
        int maxNumber = Max(x);
        System.out.println("The maximum number of the given array is: "+ maxNumber);
    }
}
