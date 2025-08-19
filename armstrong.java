
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for armstrong number: ");
        int n = sc.nextInt();
        int sum=0;
        int r;
        int count = 0;
        int temp = n;
        int m = n;
        while(m>0)
        {
            m/=10;
            count++;
        }
        while(temp>0)
        {
            r = temp%10;
            int power =1;
            for(int i = 0;i<count;i++){
                power*=r;
            } 
            sum =sum+power;
            temp/=10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

    }    
}
