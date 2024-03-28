import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] titles = {"Casio", "Seiko", "Breguet", "Chopard"};
        String[][] titlesMarks = {
                {"Casio", "MRG-B2000R-1A"},
                {"Seiko", "Grand Seiko Heritage Collection SLGH007"},
                {"Breguet", "Classique"},
                {"Chopard", "Imperiale Automatic Joaillerie"}
        };

        ArrayList<String[]> customers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String count;
        do {
            System.out.println("Выберите действие:\n" + "1 - Добавить заказ\n" + "2 - Завершить\n");
            count = sc.nextLine();

            if (count.equals("1")) {
                System.out.print("ФИО покупателя: ");
                String SNP = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                System.out.print("Номер телефона: ");
                String phone = sc.nextLine();

                System.out.println("Список часов в наличии:");
                for (int j = 0; j < titles.length; j++) {
                    System.out.println(titles[j] + " - " + titlesMarks[j][1]);
                }
                System.out.print("Выберите номер часов: ");
                int choice = sc.nextInt();

                System.out.print("Введите количество часов: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                String[] customersChoices = new String[]{titles[choice - 1], titlesMarks[choice - 1][1]};

                customers.add(new String[]{SNP, email, phone, customersChoices[0], customersChoices[1], Integer.toString(quantity)});
                System.out.println("\nИнформация о заказах:");
                for (int i = 0; i < customers.size(); i++) {
                    String[] customer = customers.get(i);
                    System.out.println("Заказ " + (i + 1) + ":");
                    System.out.println("Клиент: " + customer[0]);
                    System.out.println("Email: " + customer[1]);
                    System.out.println("Номер: " + customer[2]);
                    System.out.println("Марка: " + customer[3]);
                    System.out.println("Модель: " + customer[4]);
                    System.out.println("Количество: " + customer[5] + "\n");
                }
            }
        } while (!count.equals("2"));
        sc.close();
        return;
    }
}
