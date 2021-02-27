package collections.main.devices;

import collections.main.categories.BathroomDevice;

public class Washer extends BathroomDevice {
    public Washer() {
        this.setName("Washer");
        this.setPower(600);
        this.setState(false);
    }
}
