public class Mars {
    public static void main(String[] args) throws InterruptedException{
        String colonyName = "Atlantis";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals -= ((shipPopulation * .75) * 2);
        System.out.println(meals);

        meals = meals * .5 + meals;
        System.out.println(meals);

        shipPopulation += 5;
        System.out.println(shipPopulation);

        String landingLocation = "The Hill";

        if(landingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        landing = landingCheck(15);

        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException{
        for(int minute = 0; minute < minutesLeft; minute++){
            if(minute % 2 == 0 && minute % 3 == 0) System.out.println("Keep Center");
            if(minute % 2 == 0) System.out.println("Right");
            else if(minute % 3 == 0) System.out.println("Left");
            else System.out.println("Calculating");

            Thread.sleep(250);
        }

        System.out.println("Landed");

        return false;
    }
}
