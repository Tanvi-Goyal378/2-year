import java.util.Scanner;

public class HandShakes {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int totalHandshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of possible handshakes is: " + totalHandshakes);
    }
}
