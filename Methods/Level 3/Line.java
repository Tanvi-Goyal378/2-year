import java.util.Scanner;

public class Line {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (x2 == x1) ? Double.POSITIVE_INFINITY : (y2 - y1) / (x2 - x1);
        double b = (m == Double.POSITIVE_INFINITY) ? Double.NaN : y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dist = euclideanDistance(x1, y1, x2, y2);
        double[] eq = lineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.4f%n", dist);
        if (Double.isInfinite(eq[0])) {
            System.out.println("Line equation: x = " + x1);
        } else {
            System.out.printf("Line equation: y = %.4fx + %.4f%n", eq[0], eq[1]);
        }
        sc.close();
    }
}
