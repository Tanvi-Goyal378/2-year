import java.util.Arrays;

public class Num2 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] extractDigits(int number) {
        return String.valueOf(number).chars().map(c -> c - '0').toArray();
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;

        int count = (int) Arrays.stream(freq).filter(f -> f > 0).count();
        int[][] result = new int[count][2];
        int idx = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 1729;
        int[] digits = extractDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : freq) {
            System.out.println("Digit: " + row[0] + " -> Frequency: " + row[1]);
        }
    }
}
