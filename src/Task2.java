import java.util.*;

public class Task2 {
    static String s = """
            Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, 
            Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
            Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов""";
    static Map<String, Integer> serchmap = new HashMap<>();

    public static void main(String[] args) {
        for (String name_surename : s.split(", ")) {
            String name = name_surename.split(" ")[0];
            if (serchmap.containsKey(name))serchmap.put(name, serchmap.get(name) + 1);
            else serchmap.put(name, 1);

        }
        Map<Integer, ArrayList<String>> sortName = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : serchmap.entrySet()) {
            if (entry.getValue() > 1) {
                if (!sortName.containsKey(entry.getValue()))
                    sortName.put(entry.getValue(), new ArrayList<>(List.of(entry.getKey())));
                else sortName.get(entry.getValue()).add(entry.getKey());
            }
        }
        sortName = new TreeMap<>(sortName).descendingMap();
        for (int key :sortName.keySet()) {
            for (String val : sortName.get(key)) {
                System.out.printf("%s - %d раза\n", val, key);
            }
        }


    }
}

