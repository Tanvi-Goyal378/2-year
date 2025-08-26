import java.util.*;

class natural3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = obj.nextInt();
        int sum = 0;
        if (n >= 0) {
            System.out.println(n + " is a natural number");
            sum = n * (n + 1) / 2;
            System.out.println("Sum of natural numbers (formula): " + sum);
            int sum1 = 0;
            for(int num=0;num<=n;num++)
            {
                sum1+=num;
            }
            System.out.println("Sum of natural numbers (loop): " + sum1);
            if (sum == sum1) {
                System.out.println("Both results match");
            }
        } else {
            System.out.println(n + " is not a natural number");
        }
    }
}
