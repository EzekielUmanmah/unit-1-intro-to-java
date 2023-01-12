import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame(){
        System.out.println("Hello there! Welcome to the Guessing Game!");

        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();

        System.out.println(playerName + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Random r = new Random();
        int targetNum = r.nextInt(101) + 1;
        int tries = 0;

        while(true){
            tries++;
            System.out.print("Your guess? ");
            int guess;

            try{
                guess = scan.nextInt();
            } catch (InputMismatchException e){
                scan.next();
                System.out.println("That is not an integer!");
                continue;
            }
            if(guess > 100 || guess < 1){
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if(guess == targetNum){
                System.out.println("Well done, " + playerName + "! You found my number in " + tries + " tries!");
                break;
            }
            if(guess > targetNum){
                System.out.println("Your guess is too high, try again.");
            }
            if(guess < targetNum){
                System.out.println("Your guess is too low, try again.");
            }
        }
    }
}
