import java.util.*;

class natural2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = obj.nextInt();
        int sum = 0;
        if (n >= 0) {
            System.out.println(n + " is a natural number");
            sum = n * (n + 1) / 2;
            System.out.println("Sum of natural numbers by formula: " + sum);
            int num = 0;
            int sum1 = 0;
            while (num <= n) {
                sum1 += num;
                num++;
            }
            System.out.println("Sum of natural numbers by loop: " + sum1);
            if (sum == sum1) {
                System.out.println("Both results match");
            }
        } else {
            System.out.println(n + " is not a natural number");
        }
    }
}
