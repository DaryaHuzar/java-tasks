package fundamentals.main;

import java.util.Scanner;
//5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class TaskFive {
    static void setMonth(int a) {
        String[] month = {"январь", "феваль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String s;
        try {
            s = month[a - 1];
            System.out.println("Это месяц - " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int n = sc.nextInt();
        setMonth(n);
    }
}
