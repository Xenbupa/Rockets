public class Propellant {
    private static final int MAX_INCREMENT_POWER = 10;
    private int maximumPower;
    private int currentPower;

    public Propellant(int maximumPower) throws Exception {
        checkMaximumPower(maximumPower);
        this.maximumPower = maximumPower;
        this.currentPower = 0;

    }

    public void increasePower()  {
        currentPower += MAX_INCREMENT_POWER;
        if (this.currentPower > maximumPower) {
            this.currentPower = maximumPower;
        }
    }

    public void decreasePower()  {
        currentPower -= MAX_INCREMENT_POWER;
        if (this.currentPower < 0) {
            this.currentPower = 0;
        }
    }

    private void checkMaximumPower(int maximumPower) throws Exception {
        if (maximumPower <= 0) throw new Exception("Potencia erronea!");
    }

    public int getMaximumPower() {
        return maximumPower;
    }

    public int getCurrentPower() {
        return currentPower;
    }
}
