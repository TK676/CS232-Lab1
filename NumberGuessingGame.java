package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numToGuess = rand.nextInt (100 + 1);
        int numOfGuesses = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        
        while (win == false) {
        
            System.out.println("Please guess a number between 1 and 10: ");
            guess = input.nextInt();
            numOfGuesses++;

            if (guess == numToGuess) {
                win = true;
            }
            else if (guess < numToGuess) {
                System.out.println(guess + " is too low.");
            }
            else if (guess > numToGuess) {
                System.out.println(guess + " is too high.");
            }
        }
        
        System.out.println("Congratulations! You guessed the number in " + numOfGuesses + " guess(es)");
    }
}
