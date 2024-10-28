public abstract class SmartAppliance {
    protected String name;
    protected boolean isOn;

    public SmartAppliance(String name) {
        this.name = name;
        isOn = false;
    }

    public abstract void performAction();

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is OFF");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }
}
