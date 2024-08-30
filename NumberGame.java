// number game                                                                                        
import java.util.Random;
import java.util.Scanner;

public class NumberGame { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean tryAgain;

        do {
            int numberToGuess = random.nextInt(100
            ) + 1; // to choose a number between 1 to 100
            int attempts = 5;
            boolean hasWon = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I am thinking of a number between 1 to 100");
            System.out.println("You have " + attempts + " chances to guess it");

            for (int i = 0; i < attempts; i++) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations!!! You guessed the correct number.");
                    hasWon = true;
                    score += (attempts - i);
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guessed number is too high.");
                } else {
                    System.out.println("Your guessed number is too low.");
                }
            }

            if (!hasWon) {
                System.out.println("Sorry, you have tried all your attempts. The number to guess was " + numberToGuess + ".");
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            tryAgain = scanner.next().equalsIgnoreCase("yes");

        } while (tryAgain);

        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }
}