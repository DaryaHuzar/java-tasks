package collections.main.services;

import java.util.Scanner;

public class Menu {
    public static void mainMenu() {
        System.out.println("1. Show all Home Devices");
        System.out.println("2. Show all Kitchen Devices");
        System.out.println("3. Show all Bathroom Devices");
        System.out.println("4. Sort all by power");
        System.out.println("5. Find by power range");
        System.out.println("6. Show current power consumption");
        System.out.println("7. Exit");
    }

    public static void showAllHome() {
        Service.printDevices(Service.createList());
    }

    public static void showAllKitchen() {
        Service.printDevices
                (Service.filterDevicesByType("Kitchen Device", Service.createList()));
    }

    public static void showAllBathroom() {
        Service.printDevices
                (Service.filterDevicesByType("Bathroom Device", Service.createList()));
    }

    public static void sortByPower() {
        Service.printDevices
                (Service.sortByPowerUsed(Service.createList()));
    }

    public static void findByPower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MIN power: ");
        int min = scanner.nextInt();
        System.out.println("Enter MAX power: ");
        int max = scanner.nextInt();

        Service.printDevices
                (Service.findDeviceByPower(Service.createList(), min, max));
    }

    public static void showAllPower() {
        System.out.println("Power: " + Service.calculatePower(Service.createList()));
    }
}

