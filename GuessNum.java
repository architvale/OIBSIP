import java.util.*;

public class GuessNum {
    private static final int MAX_ATTEMPTS = 10;
    private static final int RANGE = 100;
    private static final int POINTS_PER_ATTEMPT = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        boolean keepPlaying = true;

        while (keepPlaying) {
            int targetNumber = random.nextInt(RANGE) + 1;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean numberGuessed = false;

            System.out.println("I have selected a number between 1 and " + RANGE + ". Try to guess it!");

            while (attemptsLeft > 0 && !numberGuessed) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == targetNumber) {
                    numberGuessed = true;
                    int pointsEarned = (MAX_ATTEMPTS - attemptsLeft) * POINTS_PER_ATTEMPT;
                    totalScore += pointsEarned;
                    System.out.println("Congratulations! You've guessed the number!");
                    System.out.println("Points earned: " + pointsEarned);
                } else if (userGuess < targetNumber) {
                    System.out.println("The number is higher than " + userGuess);
                } else {
                    System.out.println("The number is lower than " + userGuess);
                }

                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!numberGuessed) {
                System.out.println("Sorry! You've used all your attempts. The number was: " + targetNumber);
            }

            System.out.println("Total score: " + totalScore);
            System.out.print("Do you want to play another round? (yes/no): ");
            keepPlaying = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        scanner.close();
    }
}
