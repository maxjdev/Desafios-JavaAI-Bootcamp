package org.exercises.design_patterns.desafio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private final int id;

    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class UserManager {
    private static UserManager manager;

    private static List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public static UserManager singleton() {
        if (manager == null) manager = new UserManager();
        return manager;
    }

    public static void addUser(String name) {
        users.add(new User(users.size() + 1, name));
    }

    public static void listUsers() {
        users.forEach((u) -> {
            System.out.println(u.getId() + " - " + u.getName());
        });
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserManager manager = UserManager.singleton();

        int quantity = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            manager.addUser(name);
        }

        manager.listUsers();
    }
}
