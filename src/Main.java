public class Main {
    public static void main(String[] args) throws Exception {

        Rocket firstRocket = createFirstRocket();
        Rocket secondRocket = createSecondRocket();
        printRocketsStatus(firstRocket, secondRocket);
        manageRockets(firstRocket,secondRocket);

    }

    private static void manageRockets(Rocket firstRocket, Rocket secondRocket) {
        firstAction(firstRocket, secondRocket);
        secondAction(firstRocket,secondRocket);
        thirdAction(firstRocket,secondRocket);

    }

    private static void thirdAction(Rocket firstRocket, Rocket secondRocket) {
        speedUpRocket(firstRocket,15);
        speedUpRocket(secondRocket,15);
        System.out.println("Tercera Acció\n");
        printRocketsCurrentTotalPower(firstRocket, secondRocket);
    }

    private static void secondAction(Rocket firstRocket, Rocket secondRocket) {
        slowDownRocket(firstRocket,5);
        speedUpRocket(secondRocket,7);
        System.out.println("Segona Acció\n");
        printRocketsCurrentTotalPower(firstRocket, secondRocket);
    }

    private static void firstAction(Rocket firstRocket, Rocket secondRocket) {
        speedUpRocket(firstRocket, 3);
        speedUpRocket(secondRocket, 3);
        System.out.println("Primera Acció\n");
        printRocketsCurrentTotalPower(firstRocket,secondRocket);

    }

    private static void slowDownRocket(Rocket rocket, int speed) {
        for (int i = 0; i < speed; i++) {
            rocket.removePower();
        }
    }

    private static void speedUpRocket(Rocket rocket, int speed) {
        for (int i = 0; i < speed; i++) {
            rocket.addPower();
        }

    }

    private static Rocket createFirstRocket() throws Exception {
        Rocket rocket = new Rocket("32WESSDS");
        assignMaxPowerToPropellantsOfFirstRocket(rocket);
        return rocket;

    }

    private static Rocket createSecondRocket() throws Exception {
        Rocket rocket = new Rocket("LDSFJA32");
        assignMaxPowerToPropellantsOfSecondRocket(rocket);
        return rocket;

    }

    private static void assignMaxPowerToPropellantsOfFirstRocket(Rocket rocket) throws Exception {
        int[] firstRocketPropellantsPower = new int[]{10, 30, 80};
        for (int maximumPower : firstRocketPropellantsPower) {
            rocket.addPropellant(maximumPower, rocket.getCurrentRocketPower());

        }
    }

    private static void assignMaxPowerToPropellantsOfSecondRocket(Rocket rocket) throws Exception {
        int[] secondRocketPropellantsPower = new int[]{30, 40, 50, 50, 30, 10};
        for (int maximumPower : secondRocketPropellantsPower) {
            rocket.addPropellant(maximumPower, rocket.getCurrentRocketPower());
        }
    }

    private static void printRocketsStatus(Rocket firstRocket, Rocket secondRocket) {

        System.out.println("Rocket 1. codi: " + firstRocket.getCode() + ". número de propulsors:" + firstRocket.getPropellants().size() + "\n"
                + firstRocket.printPropellantsPower());

        System.out.println("Rocket 2. codi: " + secondRocket.getCode() + ". número de propulsors:" + secondRocket.getPropellants().size() + "\n"
                + secondRocket.printPropellantsPower());

    }

    private static void printRocketsCurrentTotalPower(Rocket firstRocket, Rocket secondRocket) {

        System.out.println(  "Potencia del segon coet " + firstRocket.getCurrentRocketPower());
        System.out.println( "Potencia del primer coet " + secondRocket.getCurrentRocketPower()+"\n");
    }
}

