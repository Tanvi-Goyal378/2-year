import java.util.Arrays;

public class Num {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] extractDigits(int number) {
        return String.valueOf(number).chars().map(c -> c - '0').toArray();
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) if (digits[i] == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == number;
    }

    public static int[] maxTwo(int[] digits) {
        int max = -1, second = -1;
        for (int d : digits) {
            if (d > max) { second = max; max = d; }
            else if (d > second && d != max) second = d;
        }
        return new int[]{max, second};
    }

    public static int[] minTwo(int[] digits) {
        int min = 10, second = 10;
        for (int d : digits) {
            if (d < min) { second = min; min = d; }
            else if (d < second && d != min) second = d;
        }
        return new int[]{min, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = extractDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));
        System.out.println("Largest & 2nd Largest: " + Arrays.toString(maxTwo(digits)));
        System.out.println("Smallest & 2nd Smallest: " + Arrays.toString(minTwo(digits)));
    }
}
