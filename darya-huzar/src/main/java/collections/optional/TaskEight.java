package collections.optional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//8. Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
public class TaskEight {
    public static void main(String[ ] args) {
        HashSet words = new HashSet<>(100);
        Scanner scan = null;
        try {
            scan = new Scanner(new File("EnglishText.txt"));
            scan.useDelimiter("[^A-z]+");
            while (scan.hasNext()) {
                String word = scan.next();
                words.add(word.toLowerCase());
            }
        }
        catch
        (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterator it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Различных слов: " + words.size());
    }
}
