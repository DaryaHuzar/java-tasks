package fundamentals.main;

import java.util.Scanner;

//3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
public class TaskThree {
    public static void main(String[] args) {
            Scanner size = new Scanner(System.in);
            System.out.println("Введите число от 0 до 100: ");
            int sizeArr = size.nextInt();
            int[] array = new int[sizeArr];
            System.out.println("Числа с переходом на новую строку: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
                System.out.println(array[i]);
            }
            System.out.println("Числа без перехода на новую строку: ");
            for (int i = 0; i < sizeArr; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }