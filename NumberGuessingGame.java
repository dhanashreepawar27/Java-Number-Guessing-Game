
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;

            System.out.println("\n=== Number Guessing Game ===");
            System.out.println("Guess a number between 1 and 100!");

            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too high! Try a smaller number.");
                } else if (guess < number) {
                    System.out.println("Too low! Try a bigger number.");
                } else {
                    System.out.println("Congratulations! You guessed correctly.");
                    System.out.println("Number of attempts: " + attempts);
                }

            } while (guess != number);

            sc.nextLine();
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
