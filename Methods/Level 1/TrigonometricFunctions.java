import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        TrigonometricFunctions trig = new TrigonometricFunctions();
        double[] results = trig.calculateTrigonometricFunctions(angle);

        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);
    }

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}
