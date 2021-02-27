package collections.main.categories;

import collections.main.devices.Device;

public class HomeDevice implements Device, Comparable<Device> {
    private int power;
    private boolean state;
    private String name;

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public boolean getState() {
        return this.state;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return "Home Device";
    }

    @Override
    public int compareTo(Device o) {
        return Integer.compare(this.getPower(), o.getPower());
    }
}
