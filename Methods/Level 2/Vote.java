import java.util.Scanner;

public class Vote {

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = scanner.nextInt();
            studentAges[i] = age;

            boolean canVote = canStudentVote(age);

            if (age < 0) {
                System.out.println("Invalid age entered. Age cannot be negative.");
            }

            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
