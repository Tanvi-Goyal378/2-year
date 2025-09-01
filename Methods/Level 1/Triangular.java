import java.util.Scanner;

public class Triangular {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distanceInMeters = 5000;
        return distanceInMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side A of the triangular park (in meters): ");
        double sideA = input.nextDouble();

        System.out.print("Enter side B of the triangular park (in meters): ");
        double sideB = input.nextDouble();

        System.out.print("Enter side C of the triangular park (in meters): ");
        double sideC = input.nextDouble();

        double rounds = calculateRounds(sideA, sideB, sideC);

        System.out.printf("The athlete must complete %.2f rounds to finish a 5 km run.\n", rounds);
    }
}
