import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        System.out.println("Booting...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Commencing...");

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Hi," + name + "— Welcome to the Expedition prep program. " +
                "Are you ready to head out into the new world?");

        System.out.print("Type Y or N ");
        char isReady = input.next().charAt(0);

        if(Character.toLowerCase(isReady) == 'y'){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your team? ");
        int numPeople = input.nextInt();
        input.nextLine();

        if(numPeople > 2){
            System.out.println("That’s way too many people. We can only send 2 more members.");
        } else if(numPeople < 2) {
            System.out.println("The team has to be exactly 2 people.");
        } else {
            System.out.println("Great. You're ready to go.");
        }
        numPeople = 2;

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        System.out.println("""
                Choose a vehicle from the list
                A: Honda Accord
                B: Toyota Camry
                C: Toyota Rav4""");
        char selection = input.next().charAt(0);
        String vehicle;
        if(Character.toUpperCase(selection) == 'A'){
            vehicle = "Honda Accord";
        }
        else if(Character.toUpperCase(selection) == 'B'){
            vehicle = "Toyota Camry";
        }
        else if(Character.toUpperCase(selection) == 'C'){
            vehicle = "Toyota Rav4";
        } else {
            vehicle = "boots";
        }

        System.out.println("Well " + name + ", you and your team of " + numPeople + " get ready to blastoff in your "
                            + vehicle + "! \nDon't forget to bring your " + snack + ". \nOne small step for man, one giant leap "
                            + "for mankind in...\n5...\n4...\n3...\n2...\n1...\nBLAST OFF!!!");

    }
}
