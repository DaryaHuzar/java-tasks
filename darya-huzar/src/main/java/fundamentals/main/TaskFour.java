package fundamentals.main;

import java.util.Scanner;
//4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
public class TaskFour {
    public static void main(String[] args) {
        System.out.println("1. Введите число.");
        System.out.println("2. Нажмите Enter.");
        System.out.println("3. Введите второе число.");
        System.out.println("4. Нажмите Enter для получения суммы и умножения двух введённых чисел.");
        Scanner enter = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = enter.nextInt();
            int y = enter.nextInt();
            System.out.println("Сумма = " + (x + y));
            System.out.println("Умножение = " + (x * y));
        }
    }
}