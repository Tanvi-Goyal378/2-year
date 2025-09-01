import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = input.nextDouble();

        WindChillCalculator calculator = new WindChillCalculator();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
    }

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
