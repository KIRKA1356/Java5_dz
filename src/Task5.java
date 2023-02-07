import java.util.*;

/**
 * Взять набор строк, например,
 * "Мороз и солнце день чудесный, еще ты дремлешь, друг прелестный. Пора, красавица, проснись."
 * Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
 * Строки с одинаковой длиной не должны “потеряться”.
 */
public class Task5 {
    static Map<Integer, ArrayList<String>> tmap = new TreeMap<>();
    static String line = "Мороз и солнце день чудесный еще ты дремлешь друг прелестный пора красавица проснись";

    public static void main(String[] args) {
        for (String word : line.split(" ")) {
            if (tmap.containsKey(word.length()))
                tmap.get(word.length()).add(word);
            else
                tmap.putIfAbsent(word.length(), new ArrayList<>(List.of(word)));
        }
        for (Map.Entry<Integer, ArrayList<String>> entry : tmap.entrySet()) {
            System.out.printf("Строки из %d символов: %s\n", entry.getKey(), entry.getValue());
        }
    }
}