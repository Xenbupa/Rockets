public class Rocket {
    private String code;
    private int propellant;

    public Rocket(String code, int propellant) {
        this.code = code;
        this.propellant = propellant;
    }

    public String getCode() {
        return code;
    }

    public int getPropellant() {
        return propellant;
    }

}
