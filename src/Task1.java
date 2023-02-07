/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int a;
        Scanner redaer = new Scanner(System.in);
        System.out.println("Сколько человек вы хотите записать в телефонную книгу?");
        a = redaer.nextInt();
        Map<String, String> tk = new HashMap<>();
        for (int i = 0; i < a; i++) {
            System.out.println("Введите имя абонента: ");
            redaer.nextLine();
            String name = redaer.nextLine();
            System.out.println("Сколько телефонов будет записано абоненту?");
            int count = redaer.nextInt();
            for (int j = 1; j <= count; j++) {
                System.out.printf("Введите телефон №" + j);
                redaer.nextLine();
                String t = redaer.nextLine();
                tk.put(t, name);
            }

        }
        System.out.println(tk);
        System.out.println(tk.get("Кирилл"));
    }
}






