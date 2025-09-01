import java.util.Random;

public class Zara {

    static Random r = new Random();

    public static int[][] generateSalaryAndYears(int n) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = r.nextInt(90000) + 10000;  // 5-digit salary between 10000 and 99999
            arr[i][1] = r.nextInt(11);             // years of service between 0 and 10
        }
        return arr;
    }

    public static double[][] calcNewSalaryAndBonus(int[][] arr) {
        int n = arr.length;
        double[][] res = new double[n][2];
        for (int i = 0; i < n; i++) {
            double bonusRate = arr[i][1] > 5 ? 0.05 : 0.02;
            double bonus = arr[i][0] * bonusRate;
            res[i][0] = arr[i][0] + bonus;  // new salary
            res[i][1] = bonus;
        }
        return res;
    }

    public static void displaySummary(int[][] oldArr, double[][] newArr) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        System.out.printf("%-10s %-10s %-12s %-10s %-10s%n", "Employee", "OldSal", "YearsServ", "Bonus", "NewSal");
        for (int i = 0; i < oldArr.length; i++) {
            oldSum += oldArr[i][0];
            bonusSum += newArr[i][1];
            newSum += newArr[i][0];
            System.out.printf("%-10d %-10d %-12d %-10.2f %-10.2f%n",
                (i + 1), oldArr[i][0], oldArr[i][1], newArr[i][1], newArr[i][0]);
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-12s %-10.2f %-10.2f%n",
                "TOTAL", oldSum, "", bonusSum, newSum);
    }

    public static void main(String[] args) {
        int[][] salaryYears = generateSalaryAndYears(10);
        double[][] newSalaryBonus = calcNewSalaryAndBonus(salaryYears);
        displaySummary(salaryYears, newSalaryBonus);
    }
}
