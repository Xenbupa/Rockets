public class Propellant {

    private int maximumPower;

    public Propellant(int maximumPower) throws Exception {
        checkNaximumPower();
        this.maximumPower = maximumPower;

    }

    private void checkNaximumPower() throws Exception {
        if(!Character.isDigit(maximumPower)) throw new Exception("Potencia erronea");
    }

    public int getMaximumPower() {
        return maximumPower;
    }

}
