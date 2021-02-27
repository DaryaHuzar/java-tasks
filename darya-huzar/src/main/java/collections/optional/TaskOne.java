package collections.optional;
import java.io.*;
import java.util.ArrayList;

//1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Чтение из файла и запись в список");
        ArrayList<String> list = new ArrayList<>();
        try {
            File file = new File("Input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println(line);
            list.add(line);
            while (null != line) {
                line = reader.readLine();
                System.out.println(line);
                list.add(line);
            }
            reader.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Чтение из списка и запись в файл в обратном порядке");
        try(FileWriter writer = new FileWriter("Output.txt", true))
        {
            int reveal = list.size();
            String s;
            for(int i = reveal - 1; i >= 0; i--) {
                s = list.get(i);
                writer.append(s).append("\n");
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
