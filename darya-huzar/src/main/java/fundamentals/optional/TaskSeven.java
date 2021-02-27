package fundamentals.optional;

import java.util.Scanner;

//7.Ввести n чисел с консоли. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
public class TaskSeven {
        public static void main(String[] args) {
            System.out.print("Введите последовательность цифр и нажмите Enter: ");
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            for (String s : line.split(" ")) {
                if (s.matches("\\d+")) {
                    System.out.println(s);
                    break;
                }
            }
        }
}
