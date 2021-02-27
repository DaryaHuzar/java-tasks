package collections.main.services;

import collections.main.devices.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Service {
    public static List<Device> createList() {
        List<Device> devices = new ArrayList<>();
        devices.add(new Washer());
        devices.add(new Microwave());
        devices.add(new Hairdryer());
        devices.add(new Fridge());
        return devices;
    }

    public static void printDevices(List<Device> devices) {
        for (Device d : devices) {
            String state = d.getState() ? "ON" : "OFF";
            String sb = "Name: " + d.getName() +
                    " | Power: " + d.getPower() +
                    " | State: " + state +
                    " | Type: " + d.getType();
            System.out.println(sb);
        }
    }

    public static List<Device> filterDevicesByType(String type, List<Device> devices) {
        List<Device> filteredList = new ArrayList<>();
        for (Device d : devices) {
            if (d.getType().equals(type)) {
                filteredList.add(d);
            }
        }
        return filteredList;
    }

    public static int calculatePower(List<Device> devices) {
        int result = 0;
        for (Device d : devices) {
            if (d.getState()) {
                result += d.getPower();
            }
        }
        return result;
    }

    public static List<Device> sortByPowerUsed(List<Device> devices) {
        Comparator<Device> deviceComparator = Comparator.comparingInt(Device::getPower);
        devices.sort(deviceComparator);
        return devices;
    }

    public static List<Device> findDeviceByPower(List<Device> devices, int min, int max) {
        List<Device> results = new ArrayList<>();
        for (Device d : devices) {
            if (d.getPower() >= min && d.getPower() <= max) results.add(d);
        }
        return results;
    }
}
