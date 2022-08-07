package org.example;

public class Main {

    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        try {
            repo.removeById(-100);
        } catch (RuntimeException e) {
            System.out.println("Id не может быть отрицательным.");
        }
    }
}