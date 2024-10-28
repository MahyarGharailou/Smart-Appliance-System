import java.util.ArrayList;
import java.util.List;

public class ApplianceController {
    private List<SmartAppliance> appliances;
    public ApplianceController() {
        appliances = new ArrayList<SmartAppliance>();
    }
    public void addAppliance(SmartAppliance appliance) {
        appliances.add(appliance);
        System.out.println(appliance.getName() + " added");

    }
    public void performAllActions() {
        for (SmartAppliance appliance : appliances) {
            appliance.performAction();
        }
    }
    public void showStatus() {
        for (SmartAppliance appliance : appliances) {
            System.out.println(appliance.getName() + " is " + (appliance.isOn() ? "on" : "off"));
        }
    }
}
