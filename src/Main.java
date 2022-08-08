import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void add(String purchase, List<String> list) {
        list.add(purchase.toLowerCase());
        System.out.println("Итого в списке покупок: " + list.size());
    }

    public static void print(List<String> list) {
        System.out.println("Список покупок: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " " + list.get(i));
        }
    }

    public static boolean delete(String namePurchase, List<String> list) {
        try {
            if (!list.remove(namePurchase.toLowerCase())) {
                int number = Integer.parseInt(namePurchase);
                if (number > 0 && number <= list.size()) {
                    System.out.println("Покупка " + list.get(number - 1) + " удалена.");
                    list.remove(number - 1);
                    print(list);
                    return true;
                } else {
                    System.out.println("ОШИБКА. Введите верно номер покупки.");
                    return false;
                }
            }
        } catch (NumberFormatException exception) {
            System.out.println("ОШИБКА. Введите верно наименование покупки или номер.");
        }
        System.out.println("Покупка " + namePurchase + " удалена.");
        print(list);
        return true;
    }

    public static void find(String search, List<String> list) {
        String queryLower = search.toLowerCase();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(queryLower)) {
                System.out.println((i + 1) + " " + list.get(i));
            }
        }
    }

    public static void menu(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        int operation;

        while (true) {
            System.out.println();
            System.out.println("Выберите операцию или введите end для завершения.");
            System.out.println("1-Добавить покупку.");
            System.out.println("2-Показать покупки.");
            System.out.println("3-Удалить покупку.");
            System.out.println("4-Найти покупку.");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            try {
                operation = Integer.parseInt(input);
                if (operation <= 0 || operation > 4) {
                    System.out.println("ОШИБКА. Введите верно номер операции.");
                    continue;
                }
            } catch (NumberFormatException exception) {
                System.out.println("ОШИБКА. Вы ввели не число или ввели не верно номер операции!");
                continue;
            }

            switch (operation) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    String purchase = scanner.nextLine();
                    add(purchase, list);
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Нет покупок.");
                        continue;
                    } else {
                        print(list);
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Нет покупок.");
                        continue;
                    } else {
                        print(list);
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название.");
                    String namePurchase = scanner.nextLine();
                    boolean result = delete(namePurchase, list);
                    if (!result) {
                        continue;
                    }
                    break;
                case 4:
                    System.out.println("Введите текст для поиска: ");
                    String search = scanner.nextLine();
                    System.out.println("Найдено:");
                    find(search, list);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        menu(list);
    }
}
