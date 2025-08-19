
import java.util.Scanner;

public class primeUsingMethods {

    static boolean isPrime(int n)
    {
        for (int i = 2; i < n/2; i++) {
            if(n%i==0)
                return false;                       
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        isPrime(a);
        
        if(isPrime(a)){
            System.out.println("Is a prime number");
        }        
        else
        System.out.println("Is not a prime number.");
    }
}
