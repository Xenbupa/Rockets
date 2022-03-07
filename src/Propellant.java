public class Propellant {

    private int maximumPower;

    public Propellant(int maximumPower) throws Exception {
        checkMaximumPower(maximumPower);
        this.maximumPower = maximumPower;

    }

    private void checkMaximumPower(int maximumPower) throws Exception {
        if(maximumPower<=0)throw new Exception("Potencia erronea!");
    }

    public int getMaximumPower() {
        return maximumPower;
    }

}
