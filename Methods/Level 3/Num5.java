public class Num5 {

    public static int sumOfProperDivisors(int number) {
        int sum = 1; // 1 is a proper divisor for all >1
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return number == 1 ? 0 : sum; // 1 has no proper divisors except itself excluded
    }

    public static boolean isPerfect(int number) {
        return number > 0 && sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return number > 0 && sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return number > 0 && sumOfProperDivisors(number) < number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Perfect? " + isPerfect(num));
            System.out.println("Abundant? " + isAbundant(num));
            System.out.println("Deficient? " + isDeficient(num));
            System.out.println("Strong? " + isStrong(num));
            System.out.println("------------------------");
        }
    }
}
