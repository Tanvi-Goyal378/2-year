import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 1; i <= n; i++) {
            int phy = rand.nextInt(100);
            int chem = rand.nextInt(100);
            int math = rand.nextInt(100);

            int total = phy + chem + math;
            int avg = Math.round(total / 3f);
            int per = Math.round(total / 3f);  // same as avg since each subject /100

            char grade;
            if (per >= 80) grade = 'A';
            else if (per >= 70) grade = 'B';
            else if (per >= 60) grade = 'C';
            else if (per >= 50) grade = 'D';
            else if (per >= 40) grade = 'E';
            else grade = 'R';

            System.out.println(i + "\t" + phy + "\t" + chem + "\t" + math + "\t" +
                               total + "\t" + avg + "\t" + per + "\t" + grade);
        }
    }
}