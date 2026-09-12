import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        System.out.println("🎮 Welcome to Number Guessing Game!");

        while (playAgain) {

            System.out.println("\nChoose Difficulty:");
            System.out.println("1. Easy   (1 - 50)");
            System.out.println("2. Medium (1 - 100)");
            System.out.println("3. Hard   (1 - 200)");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            int maxNumber;

            if (choice == 1) {
                maxNumber = 50;
            } 
            else if (choice == 2) {
                maxNumber = 100;
            } 
            else if (choice == 3) {
                maxNumber = 200;
            } 
            else {
                System.out.println("Invalid choice! Starting Medium difficulty.");
                maxNumber = 100;
            }

            int secretNumber = random.nextInt(maxNumber) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\nI have chosen a number between 1 and " + maxNumber + ".");
            System.out.println("Try to guess it!");

            while (guess != secretNumber) {

                System.out.print("Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("⚠️ Please enter a valid number.");
                    scanner.next();
                    continue;
                }

                guess = scanner.nextInt();

                if (guess < 1 || guess > maxNumber) {
                    System.out.println("⚠️ Please enter a number between 1 and " + maxNumber + ".");
                    continue;
                }

                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too high! 🔼 Try again.");
                } 
                else if (guess < secretNumber) {
                    System.out.println("Too low! 🔽 Try again.");
                } 
                else {
                    System.out.println("🎉 Correct!");
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThanks for playing! 👋");
        scanner.close();
    }
}
