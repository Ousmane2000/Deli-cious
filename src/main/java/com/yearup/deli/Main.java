package com.yearup.deli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the DELI-cious Home Screen");
            System.out.println("Choose an option:");
            System.out.println("A) New Order");
            System.out.println("B) Exit");

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "A":
                    newOrder(scanner);
                    break;

                case "B":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
        scanner.close();
    }


    private static void newOrder(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Order Screen");
            System.out.println("Please choose option");
            System.out.println("A) Add Sandwich");
            System.out.println("B) Add Drink");
            System.out.println("C) Add Chips");
            System.out.println("D) Checkout");
            System.out.println("0) Cancel Order");

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "A":
                    addSandwich(scanner);
                    break;

                case "B":
                    addDrink(scanner);
                    break;

                case "C":
                    addChips(scanner);
                    break;

                case "D":
                    checkout(scanner);
                    break;

                case "0":
                    running = false;

                default:
                    System.out.println("Invalid Option");
                    break;

            }

        }
    }

    private static void addSandwich(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Please select type of bread:");
            System.out.println("Please select sandwich size:");
            System.out.println("Please select toppings:");
            System.out.println("Would you like it toasted? Y/N");
        }
    }

    private static void addDrink(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Please select drink size:");
            System.out.println("Please select drink flavor:");
        }
    }

    private static void addChips(Scanner scanner) {

    }

    private static void checkout(Scanner scanner) {

    }
}


