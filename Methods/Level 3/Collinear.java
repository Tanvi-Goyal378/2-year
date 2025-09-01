import java.util.Scanner;

public class Collinear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates for point A (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for point B (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for point C (x3, y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        scanner.close();

        System.out.println("\nChecking for collinearity using Slope Formula:");
        checkCollinearBySlope(x1, y1, x2, y2, x3, y3);

        System.out.println("\nChecking for collinearity using Area of Triangle Formula:");
        checkCollinearByArea(x1, y1, x2, y2, x3, y3);
    }

    public static void checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeAC = (y3 - y1) / (x3 - x1);

        if (Math.abs(slopeAB - slopeAC) < 1e-9) { 
            System.out.println("The points are collinear based on the slope formula.");
        } else {
            System.out.println("The points are not collinear based on the slope formula.");
        }
    }

    public static void checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        if (Math.abs(area) < 1e-9) {
            System.out.println("The points are collinear because the area of the triangle is 0.");
        } else {
            System.out.println("The points are not collinear because the area of the triangle is not 0.");
        }
    }
}