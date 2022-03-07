public class Main {
    public static void main(String[] args) throws Exception {

        Rocket firstRocket = createFirstRocket();
        Rocket secondRocket = createSecondRocket();
        assignMaxPowerToPropellants(firstRocket, secondRocket);
        printRocketsStatus(firstRocket, secondRocket);
    }

    private static void assignMaxPowerToPropellants(Rocket firstRocket, Rocket secondRocket) throws Exception {
        assignMaxPowerToPropellantsOfFirstRocket(firstRocket);
        assignMaxPowerToPropellantsOfSecondRocket(secondRocket);
    }

    private static Rocket createFirstRocket() throws Exception {
        String code = "32WESSDS";
        return new Rocket(code);
    }

    private static Rocket createSecondRocket() throws Exception {
        String code = "LDSFJA32";
        return new Rocket(code);
    }

    private static void assignMaxPowerToPropellantsOfFirstRocket(Rocket rocket) throws Exception {
        int[] firstRocketPropellantsPower = new int[]{10, 30, 80};
        for (int maximumPower : firstRocketPropellantsPower) {
            rocket.addPropellant(maximumPower);
        }
    }

    private static void assignMaxPowerToPropellantsOfSecondRocket(Rocket rocket) throws Exception {
        int[] secondRocketPropellantsPower = new int[]{30, 40, 50, 50, 30, 10};
        for (int maximumPower : secondRocketPropellantsPower) {
            rocket.addPropellant(maximumPower);
        }
    }

    private static void printRocketsStatus(Rocket firstRocket, Rocket secondRocket) {

        System.out.println("Rocket 1. codi: " + firstRocket.getCode() + ". número de propulsors:" + firstRocket.getPropellants().size() + "\n"
                + firstRocket.printPropellantsPower());
        System.out.println("Rocket 2. codi: " + secondRocket.getCode() + ". número de propulsors:" + secondRocket.getPropellants().size() + "\n"
                + secondRocket.printPropellantsPower());

    }

}

