package fundamentals.main;

//2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class TaskTwo {
    public static void main(String[] args) {
        String line = "123456";
        String reverse = new StringBuffer(line).reverse().toString();
        System.out.println("\nСтрока: " + line);
        System.out.println("Строка в обратном порядке: " + reverse);
    }
}

