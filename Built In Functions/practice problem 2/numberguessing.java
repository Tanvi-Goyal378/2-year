import java.util.*;

class numberguessing {

    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    // Generate a random guess between low and high
    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    // Get feedback from the user
    public static String getFeedback(int guess) {
        System.out.print("Is " + guess + " your number? (Enter 'low', 'high', or 'correct'): ");
        return sc.next().toLowerCase();
    }

    // Run the game
    public static void playGame() {
        int low = 1, high = 100;
        int guess;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        do {
            guess = generateGuess(low, high);
            feedback = getFeedback(guess);

            if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
        } while (!feedback.equals("correct"));

        System.out.println("Yay! I guessed your number: " + guess);
    }

    public static void main(String[] args) {
        playGame();
    }
}
