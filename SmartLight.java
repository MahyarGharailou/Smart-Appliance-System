public class SmartLight extends SmartAppliance {
    private int brightness; 
    public SmartLight(String name) {
        super(name);
        brightness = 0;
    }
    @Override
    public void performAction() {
        if (isOn) {
            System.out.println(name + " brightness is lighting up " + brightness);
        }
        else 
        {
            System.out.println(name + " Off");
        }
    }
    public void setBrightness(int brightness) {
        if (brightness < 0 || brightness > 100) {
            System.out.println("brightness should be 0-100");
        } 
        else 
        {
            this.brightness = brightness;
            System.out.println(name + " brightness set " + brightness);
        }
    }
}
