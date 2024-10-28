public class SmartFan extends SmartAppliance implements Adjustable {
    private int speed;

    public SmartFan(String name) {
        super(name);
        speed = 0;
    }
    @Override
    public void performAction() {
        if ( isOn ) {
            System.out.println(name + " spinning at speed " + speed);
        }
        else
        {
            System.out.println(name + " off");
        }
    }
    @Override
    public void increaseSetting() {
        speed++;
        if (speed > 5) {
            speed = 5;
            System.out.println(name + " is already at max speed");
        }
        else
        {
            System.out.println(name + " speed increased to " + speed);
        }
    }
    @Override
    public void decreaseSetting() {
        speed--;
        if (speed < 0) { speed = 0;
            System.out.println(name + " is already at min speed");
        } 
        else 
        {
            System.out.println(name + " speed decreased to " + speed);
        }
    }
}
