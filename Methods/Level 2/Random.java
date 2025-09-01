import java.util.Arrays;

public class Random {

    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000; // Generates number between 1000 and 9999
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomValues = generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit numbers: " + Arrays.toString(randomValues));

        double[] result = findAverageMinMax(randomValues);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + (int)result[1]);
        System.out.println("Maximum: " + (int)result[2]);
    }
}
