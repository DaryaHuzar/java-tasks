package fundamentals.main;

import java.util.Scanner;
//1.Приветствовать любого пользователя при вводе его имени через командную строку.
public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Введите имя и нажмите Enter:");
        Scanner enterName = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Hello, " + enterName.nextLine());
        }
    }
}
