import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Random random = new Random();
        
        int min= 1,max=100;
        int attemptsLimit = 5;
        int rounds = 0;
        int totAttempts = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNum = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            
            System.out.println("----Number Guessing Game!----");
            System.out.println("Guess a number between " + min + " and " + max);
            
            while (true) {
                System.out.print("Enter your guess: ");
                int userGuess = x.nextInt();
                attempts++;
                
                if (userGuess == targetNum) {
                    System.out.println("Guessed the correct number: " + targetNum);
                    break;
                } else if (userGuess < targetNum) {
                    System.out.println("too low");
                } else {
                    System.out.println("too high");
                }
                
                if (attempts >= attemptsLimit) {
                    System.out.println("Out of attempts...correct num: " + targetNum);
                    break;
                }
            }
            
            totAttempts += attempts;
            rounds++;
            
            System.out.print("Play again? (yes/no): ");
            String playAgainInput = x.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        
        System.out.println("Here is your score:");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("No of attempts: " + totAttempts);
        
    }
}