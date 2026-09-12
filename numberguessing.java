import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
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

        scanner.close();
    }
}
