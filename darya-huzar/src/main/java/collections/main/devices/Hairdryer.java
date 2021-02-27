package collections.main.devices;

import collections.main.categories.BathroomDevice;

public class Hairdryer extends BathroomDevice {
    public Hairdryer() {
        setPower(1200);
        setState(false);
        setName("Hairdryer");
    }
}
