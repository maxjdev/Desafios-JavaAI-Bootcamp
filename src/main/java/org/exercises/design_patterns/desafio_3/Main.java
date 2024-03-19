package org.exercises.design_patterns.desafio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interface Observer
interface Observer {
    void update(String productName);
}

// Classe concreta Observer
class User implements Observer {
    private String name;

    private boolean subscribed;

    public User(String name) {
        this.name = name;
    }

    public void subscribe() {
        this.subscribed = true;
    }

    public void unsubscribe() {
        this.subscribed = false;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    @Override
    public void update(String productName) {
        if (subscribed) {
            System.out.println("Notificacao recebida: Novo produto adicionado - " + productName);
        }
    }
}

// Interface Observable
interface CatalogObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String productName);
}

// Classe concreta Observable
class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers(String productName) {
        // TODO: Implementar lógica para notificar apenas os usuários que desejam ser notificados
        observers.forEach(observer -> observer.update(productName));
    }

    public void addProduct(String name, String description, double price) {
        notifyObservers(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando catálogo e usuário
        Catalog catalog = new Catalog();
        User user = new User("Usuário 1");

        // Inscricao do usuário no catálogo
        catalog.addObserver(user);

        // Adicionando novo produto
        String name = scanner.nextLine();
        String description = scanner.nextLine();
        double price = scanner.nextDouble();

        scanner.nextLine(); // Consumir a quebra de linha após nextDouble
        String subscribeChoice = scanner.nextLine();

        // TODO: Verifique qual foi a escolha de notificação (S ou N) do usuário
        if (subscribeChoice.equalsIgnoreCase("cancelar") ||
                subscribeChoice.equalsIgnoreCase("n")) {
            user.unsubscribe();
        } else {
            user.subscribe();
        }

        // Adicionando produto ao catálogo
        catalog.addProduct(name, description, price);

        if (!user.isSubscribed()) {
            System.out.println("Programa Encerrado.");
        }
    }
}