public class Main {
    public static void main(String[] args) throws Exception {

        Rocket firstRocket = createFirstRocket();
        Rocket secondRocket = createSecondRocket();
        printRocketsStatus(firstRocket, secondRocket);
        moveRockets(firstRocket, secondRocket);

    }

    private static void moveRockets(Rocket firstRocket, Rocket secondRocket) {
        firstMovement(firstRocket, secondRocket);
        secondMovement(firstRocket, secondRocket);
        thirdMovement(firstRocket, secondRocket);

    }

    private static void thirdMovement(Rocket firstRocket, Rocket secondRocket) {
        speedUpRocket(firstRocket, 15);
        speedUpRocket(secondRocket, 15);
        System.out.println("Tercera Acció\n");
        printRocketsCurrentTotalPower(firstRocket, secondRocket);
    }

    private static void secondMovement(Rocket firstRocket, Rocket secondRocket) {
        slowDownRocket(firstRocket, 5);
        speedUpRocket(secondRocket, 7);
        System.out.println("Segona Acció\n");
        printRocketsCurrentTotalPower(firstRocket, secondRocket);
    }

    private static void firstMovement(Rocket firstRocket, Rocket secondRocket) {
        speedUpRocket(firstRocket, 3);
        speedUpRocket(secondRocket, 3);
        System.out.println("Primera Acció\n");
        printRocketsCurrentTotalPower(firstRocket, secondRocket);

    }

    private static void slowDownRocket(Rocket rocket, int speed) {
        for (int i = 0; i < speed; i++) {
            rocket.decreasePower();
        }
    }

    private static void speedUpRocket(Rocket rocket, int speed) {
        for (int i = 0; i < speed; i++) {
            rocket.increasePower();
        }

    }

    private static Rocket createFirstRocket() throws Exception {
        Rocket rocket = new Rocket("32WESSDS");
        assignPropellersToRocket(generateFirstRocketPropellantArray(rocket),rocket);
        return rocket;

    }

    private static Rocket createSecondRocket() throws Exception {
        Rocket rocket = new Rocket("LDSFJA32");
        assignPropellersToRocket(generateSecondRocketPropellantArray(rocket),rocket);
        return rocket;

    }

    private static int[] generateFirstRocketPropellantArray(Rocket rocket) throws Exception {
        return new int[]{10, 30, 80};

    }
    private static int[] generateSecondRocketPropellantArray(Rocket rocket) throws Exception {
        return new int[]{30, 40, 50, 50, 30, 10};

    }

    private static void assignPropellersToRocket(int[] propellants, Rocket rocket) throws Exception {
        for (int maximumPower : propellants) {
            rocket.addPropellant(maximumPower);
        }
    }


    private static void printRocketsStatus(Rocket firstRocket, Rocket secondRocket) {

        System.out.println("Rocket 1. codi: " + firstRocket.getCode() + ". número de propulsors:" + firstRocket.getPropellants().size() + "\n"
                + firstRocket.printPropellantsPower());

        System.out.println("Rocket 2. codi: " + secondRocket.getCode() + ". número de propulsors:" + secondRocket.getPropellants().size() + "\n"
                + secondRocket.printPropellantsPower());

    }

    private static void printRocketsCurrentTotalPower(Rocket firstRocket, Rocket secondRocket) {

        System.out.println("Potencia del primer coet " + firstRocket.getCurrentRocketPower());
        System.out.println("Potencia del segon coet " + secondRocket.getCurrentRocketPower() + "\n");
    }
}

