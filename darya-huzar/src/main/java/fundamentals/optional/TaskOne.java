package fundamentals.optional;

import java.util.Scanner;
//1.Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longWord = "", shortWord = line;
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println("Самое длинное число: '" + longWord + "'");
        System.out.println("Длина: " + longWord.length());
        System.out.println("Самое короткое число: '" + shortWord + "'");
        System.out.println("Длина: " + shortWord.length());

    }
}
