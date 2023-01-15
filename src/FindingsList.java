import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back traveler!");

//        String[] rocksList = new String[]{"rock", "weird rock", "smooth rock", "not rock"};
        ArrayList<String> rockList = new ArrayList<>();
        rockList.add("rock");
        rockList.add("smooth rock");
        rockList.add("weird rock");
        rockList.add("not rock");

        System.out.println("Everything downloaded...");

        System.out.println(rockList);

        System.out.println("Computer detects non-rock...\ndeleting...");

        rockList.remove("not rock");
        System.out.println(rockList);

        System.out.println("Perfect!");

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implying there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println(fossils);
        System.out.println("Fossil data downloaded.");

        System.out.println("Which of the fossils would you like to learn more about (Bird, fish, or tooth)?");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        for(String key: fossils.keySet()){
            if(key.toLowerCase().contains(userInput.toLowerCase())){
                System.out.println("Chosen fossil: " + key + "\nDescription: " + fossils.get(key));
            }
        }

        Thread.sleep(700);

        HashSet supplies = new HashSet();
        supplies.addAll(Arrays.asList("food", "drinks", "books"));

        System.out.println("Supplies before expedition:");
        Iterator itr = supplies.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        supplies.remove("drinks");

        System.out.println("Supplies after expedition:");
        itr = supplies.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
