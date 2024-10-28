public class SmartHomeSystem {
    public static void main(String[] args) {
        ApplianceController controller = new ApplianceController();
        SmartFan fan = new SmartFan("living Room Fan");
        SmartHeater heater = new SmartHeater("bedroom Heater");
        SmartLight light = new SmartLight("kitchen Light");

        controller.addAppliance(fan);
        controller.addAppliance(heater);
        controller.addAppliance(light);
        fan.turnOn();
        fan.increaseSetting();
        fan.performAction();
        heater.turnOn();
        heater.increaseSetting();
        heater.performAction();
        light.setBrightness(75);
        light.turnOn();
        light.performAction();
        controller.performAllActions();
        controller.showStatus();
    }
}
