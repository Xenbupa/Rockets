

public class Main {
    public static void main(String[] args) {
        Rocket firstRocket = createFirstRocket();
        Rocket secondRocket = createSecondRocket();
        printRocketsStatus(firstRocket, secondRocket);

    }

    private static Rocket createFirstRocket() {
        String code = "32WESSDS";
        int propellant = 3;
        return new Rocket(code, propellant);
    }

    private static Rocket createSecondRocket() {
        String code = "LDSFJA32";
        int propellant = 6;
        return new Rocket(code, propellant);

    }


    private static void printRocketsStatus(Rocket firstRocket, Rocket secondRocket) {

        System.out.println("Rocket 1 amb codi: " + firstRocket.getCode() + ". Número de propulsors " + firstRocket.getPropellant());
        System.out.println("Rocket 2 amb codi: " + secondRocket.getCode() + ". Número de propulsors " + secondRocket.getPropellant());

    }

}
