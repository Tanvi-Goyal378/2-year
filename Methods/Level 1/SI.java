import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal = getInput(input, "Enter Principal: ");
        double rate = getInput(input, "Enter Rate of Interest: ");
        double time = getInput(input, "Enter Time (in years): ");
        
        double interest = calculateSimpleInterest(principal, rate, time);
        
        System.out.println("The Simple Interest is " + interest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
    }

    public static double getInput(Scanner input, String message) {
        System.out.print(message);
        return input.nextDouble();
    }

    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
