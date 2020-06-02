package ru.job4j.tracker;

import java.util.Objects;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getName() + " " + item.getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter id for edit: ");
                String id = scanner.nextLine();
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Success action");
                } else {
                    System.out.println("Error");
                    // вывод об ошибке
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id for delete: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Success action");
                } else {
                    System.out.println("Error");
                    // вывод об ошибке
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id====");
                System.out.print("Enter id for searching: ");
                String id = scanner.nextLine();
                Item itemFindId = tracker.findById(id);
                boolean rsl = Objects.isNull(itemFindId);
                if (rsl) {
                    System.out.println("Found nothing");
                } else {
                    System.out.println("Your item - " + itemFindId.getName());
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name====");
                System.out.print("Enter name for searching: ");
                String name = scanner.nextLine();
                Item[] itemFindName = tracker.findByName(name);
                boolean rsl = Objects.isNull(itemFindName);
                if (rsl) {
                    System.out.println("Found nothing");
                } else {
                    for (Item item : itemFindName) {
                        System.out.println(item.getName());
                    }
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.\n"
                + "0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program");
        // добавить остальные пункты меню.
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

}