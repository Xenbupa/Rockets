import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String code;

    private List<Propellant> propellants = new ArrayList<>();


    public Rocket(String code) throws Exception {
        checkCode(code);
        this.code = code;

    }

    private void checkCode(String code) throws Exception {
        if (!code.matches("[A-Z0-9]{8}")) {
            throw new Exception("codi erroni!");
        }
    }

    public String getCode() {
        return code;
    }

    public void addPropellant(int maximumPower) throws Exception {
        propellants.add(new Propellant(maximumPower));

    }

    public List<Propellant> getPropellants() {
        return propellants;
    }

    public void increasePower()  {
        for (Propellant propellant : propellants) {
            propellant.increasePower();
        }
    }
    public void decreasePower()  {
        for (Propellant propellant : propellants) {
            propellant.decreasePower();
        }
    }


    public int getCurrentRocketPower() {
        int result = 0;
        for (Propellant propellant : propellants) {
            result += propellant.getCurrentPower();
        }
        return result;
    }

    public String printPropellantsPower() {
        String result = "";
        int i = 1;
        for (Propellant propellant : propellants) {
            result += "Propulsor " + i + " : màxima potencia " + propellant.getMaximumPower() + " \n";
            i++;
        }
        return result;
    }


}

