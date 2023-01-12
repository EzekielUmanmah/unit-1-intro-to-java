import java.util.Scanner;


public class GuessingGame {
    public GuessingGame(){
        String name;
    }

    public static void main(String[] args){
        System.out.println("Hello there! Welcome to the Guessing Game!");

        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
    }
}
