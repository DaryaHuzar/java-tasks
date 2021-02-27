package collections.main.devices;

public interface Device {
    int getPower();
    boolean getState();
    void setPower(int power);
    void setState(boolean state);
    String getName();
    void setName(String name);
    String getType();
}
