import java.util.*;

public class Bmi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;   
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            height[i] = sc.nextDouble();

            double hMeters = height[i] / 100.0;
            bmi[i] = Math.round((weight[i] / (hMeters * hMeters)) * 10.0) / 10.0;

            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nID\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + weight[i] + "\t" + height[i] + "\t" + bmi[i] + "\t" + status[i]);
        }
    }
}