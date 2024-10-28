public class SmartHeater extends SmartAppliance implements Adjustable {
    private double temperature;
    public SmartHeater(String name) {
        super(name);
        temperature = 20;
    }
    @Override
    public void performAction() {
        if (isOn) {
            System.out.println(name + " heating to " + temperature + " degrees");
        }
        else 
        {
            System.out.println(name + " is off"); 
        }
    }
    @Override
    public void increaseSetting() {
        temperature += 2;
        System.out.println(name + " temperature increased to " + temperature);
    }
    @Override
    public void decreaseSetting() {
        temperature -= 2;
        System.out.println(name + " temperature decreased to " + temperature);
    }
}
