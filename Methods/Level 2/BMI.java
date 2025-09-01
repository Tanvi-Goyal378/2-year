import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        double[][] data = new double[10][3];
        get_input(data);
        calculate_bmi(data);
        display_results(data);
    }

    public static void get_input(double[][] data) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight in kg for person " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height in cm for person " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static void calculate_bmi(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height_cm = data[i][1];
            double height_m = height_cm / 100.0;
            data[i][2] = weight / (height_m * height_m);
        }
    }

    public static String get_status(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void display_results(double[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = get_status(bmi);
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", weight, height, bmi, status);
        }
    }
}