import java.util.Random;
import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.close();

        int[][] pcmScores = generateRandomScores(numStudents);
        double[][] scoreDetails = calculateDetails(pcmScores);
        displayScorecard(pcmScores, scoreDetails);
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(61) + 40; // Random scores between 40 and 100
            }
        }
        return scores;
    }

    public static double[][] calculateDetails(int[][] scores) {
        double[][] details = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 3;
            
            details[i][0] = total;
            details[i][1] = Math.round(average * 100.0) / 100.0;
            details[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return details;
    }

    public static void displayScorecard(int[][] scores, double[][] details) {
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Avg", "Grade");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            int total = (int) details[i][0];
            double avg = details[i][1];
            String grade = calculateGrade((int) details[i][2]);
            
            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10.2f %-10s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], total, avg, grade);
        }
        System.out.println("------------------------------------------------------------------");
    }

    public static String calculateGrade(int percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
}