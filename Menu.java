import java.util.Scanner;
import java.util.TreeMap;

public class Menu {
    String numberMenu;

    TreeMap<Integer, String> chekMap = new TreeMap<>();

    public String entrMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" ");

        return this.numberMenu = scan.nextLine();

    }

    public void menu() {
        System.out.println("Выберети необходимые параметры фильтрации" +
                "\n 1 - Показать все" +
                "\n 2 - Производитель" +
                "\n 3 - Оперативная память в Гб." +
                "\n 4 - Память HDD в Гб." +
                "\n 5 - Операционная система" +
                "\n 6 - Цвет" +
                "\n 9 - закончить выбор/выйти");

        System.out.print("Введите значение:");

        switch (Integer.parseInt(entrMenu())) {
            case 1:
                NoutBooksList nList = new NoutBooksList();
                for (NoutBook n : nList.noutList()) {

                    System.out.println(n.prinTo());

                }

                break;
            case 2:
                System.out.print("Производитель: ");
                String name = "x";
                name = entrMenu().toLowerCase().trim();
                if (name == "") {
                    menu();

                    break;

                } else {
                    chekMap.put(1, name);
                    menu();

                    break;
                }

            case 3:
                System.out.print("Оперативная память в Гб: ");
                name = "x";
                name = entrMenu().toLowerCase().trim();
                if (name == "") {
                    menu();

                    break;

                } else {
                    if (Integer.parseInt(name) <= 24) {

                        chekMap.put(2, "24");
                    } else if (Integer.parseInt(name) > 24 && Integer.parseInt(name) <= 28) {
                        chekMap.put(2, "24");
                    } else if (Integer.parseInt(name) > 28 && Integer.parseInt(name) <= 32) {
                        chekMap.put(2, "32");
                    } else if (Integer.parseInt(name) > 32) {
                        chekMap.put(2, "32");
                    }
                    menu();

                    break;
                }
            case 4:
                System.out.print("Память HDD в Гб: ");
                name = "x";
                name = entrMenu().toLowerCase().trim();
                if (name == "") {
                    menu();

                    break;

                } else {
                    if (Integer.parseInt(name) <= 1000) {

                        chekMap.put(3, "1000");
                    } else if (Integer.parseInt(name) > 1000 && Integer.parseInt(name) <= 1500) {
                        chekMap.put(3, "1000");
                    } else if (Integer.parseInt(name) > 1500 && Integer.parseInt(name) <= 2000) {
                        chekMap.put(3, "2000");
                    } else if (Integer.parseInt(name) > 2000) {
                        chekMap.put(3, "2000");
                    }
                    menu();

                    break;
                }
            case 5:
                System.out.print("Операционная система (linux, win10, win11, no): ");
                name = "x";
                name = entrMenu().toLowerCase().trim();
                if (name == "") {
                    menu();

                    break;

                } else {
                    chekMap.put(4, name);

                    menu();

                    break;
                }
            case 6:
                System.out.print("Цвет: ");
                name = "x";
                name = entrMenu().toLowerCase().trim();
                if (name == "") {
                    menu();

                    break;

                } else {
                    chekMap.put(5, name);

                    menu();

                    break;
                }

            case 9:
                break;
            default:

                break;
        }
    }

}