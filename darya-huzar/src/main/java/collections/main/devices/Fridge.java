package collections.main.devices;

import collections.main.categories.KitchenDevice;

public class Fridge extends KitchenDevice {
    public Fridge() {
        setPower(400);
        setState(true);
        setName("Fridge");
    }

    public Fridge(String name) {
        setPower(400);
        setState(true);
        setName(name);
    }
}
