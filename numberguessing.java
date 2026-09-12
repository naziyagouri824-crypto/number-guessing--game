import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        System.out.println("🎮 Welcome to Number Guessing Game!");

        while (playAgain) {

            System.out.println("\n==============================");
            System.out.println("       CHOOSE DIFFICULTY");
            System.out.println("==============================");
            System.out.println("1. Easy   (1 - 50)");
            System.out.println("2. Medium (1 - 100)");
            System.out.println("3. Hard   (1 - 200)");

            System.out.print("Enter your choice: ");

            int choice;

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("⚠️ Invalid input! Starting Medium difficulty.");
                scanner.next();
                choice = 2;
            }

            int maxNumber;
            int maxAttempts;
            int startingScore;

            if (choice == 1) {
                maxNumber = 50;
                maxAttempts = 10;
                startingScore = 100;
            }
            else if (choice == 2) {
                maxNumber = 100;
                maxAttempts = 8;
                startingScore = 150;
            }
            else if (choice == 3) {
                maxNumber = 200;
                maxAttempts = 7;
                startingScore = 200;
            }
            else {
                System.out.println("⚠️ Invalid choice! Starting Medium difficulty.");
                maxNumber = 100;
                maxAttempts = 8;
                startingScore = 150;
            }

            int secretNumber = random.nextInt(maxNumber) + 1;
            int guess = 0;
            int attempts = 0;
            int score = startingScore;
            boolean won = false;

            System.out.println("\n🎯 I have chosen a number between 1 and " + maxNumber + ".");
            System.out.println("You have " + maxAttempts + " attempts.");
            System.out.println("Try to guess it!");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("⚠️ Please enter a valid number.");
                    scanner.next();
                    continue;
                }

                guess = scanner.nextInt();

                if (guess < 1 || guess > maxNumber) {
                    System.out.println(
                        "⚠️ Please enter a number between 1 and " + maxNumber + "."
                    );
                    continue;
                }

                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too high! 🔼 Try again.");
                    score -= 10;
                }
                else if (guess < secretNumber) {
                    System.out.println("Too low! 🔽 Try again.");
                    score -= 10;
                }
                else {
                    won = true;

                    if (score < 0) {
                        score = 0;
                    }

                    System.out.println("\n🎉 Congratulations! You guessed it!");
                    System.out.println("🔢 Attempts: " + attempts);
                    System.out.println("🏆 Your Score: " + score);
                    break;
                }
            }

            if (!won) {
                System.out.println("\n❌ Game Over!");
                System.out.println("The correct number was: " + secretNumber);
                System.out.println("🏆 Your Score: 0");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n================================");
        System.out.println("   Thanks for playing! 👋");
        System.out.println("================================");

        scanner.close();
    }
}
