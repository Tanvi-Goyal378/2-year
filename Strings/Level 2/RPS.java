import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];

        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock, paper, scissors) for game " + (i + 1) + ": ");
            String user = sc.nextLine().toLowerCase();
            while (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
                System.out.print("Invalid choice. Enter again: ");
                user = sc.nextLine().toLowerCase();
            }

            int compNum = (int)(Math.random() * 3);
            String comp = "";
            if (compNum == 0) comp = "rock";
            else if (compNum == 1) comp = "paper";
            else comp = "scissors";

            String winner = "";
            if (user.equals(comp)) winner = "Draw";
            else if ((user.equals("rock") && comp.equals("scissors")) ||
                     (user.equals("paper") && comp.equals("rock")) ||
                     (user.equals("scissors") && comp.equals("paper"))) {
                winner = "User";
                userWins++;
            } else {
                winner = "Computer";
                compWins++;
            }

            userChoices[i] = user;
            compChoices[i] = comp;
            winners[i] = winner;
            if (winner.equals("Draw")) draws++;
        }

        System.out.println("\nGame\tUser\tComputer\tWinner");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + userChoices[i] + "\t" + compChoices[i] + "\t\t" + winners[i]);
        }

        double userPercent = (n == 0) ? 0 : (userWins * 100.0 / n);
        double compPercent = (n == 0) ? 0 : (compWins * 100.0 / n);

        System.out.println("\nSummary:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage (User / Computer): %.2f%% / %.2f%%\n", userPercent, compPercent);
    }
}
