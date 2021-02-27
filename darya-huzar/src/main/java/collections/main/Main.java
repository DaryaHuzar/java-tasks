package collections.main;

import collections.main.services.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.mainMenu();
            System.out.println();
            System.out.println("Enter: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Menu.showAllHome();
                    break;
                case 2:
                    Menu.showAllKitchen();
                    break;
                case 3:
                    Menu.showAllBathroom();
                    break;
                case 4:
                    Menu.sortByPower();
                    break;
                case 5:
                    Menu.findByPower();
                    break;
                case 6:
                    Menu.showAllPower();
                    break;
                case 7:
                    return;
                default:
                    break;
            }
        }
    }
}
