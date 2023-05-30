package com.yearup.deli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== Welcome to the DELI-cious Home Screen =====");
            System.out.println("Choose an option: ");
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
            System.out.println("===== Welcome to the Order Screen =====");
            System.out.println("Please choose option: ");
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
        scanner.close();
    }

    private static void addSandwich(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("----- Choose an Option -----");
            System.out.println("A) Select Sandwich Size: ");
            System.out.println("B) Select Bread: ");
            System.out.println("C) Select Toppings: ");
            System.out.println("D) Toasted? y/n");

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "A":
                    sandwichSizeOption(scanner);
                    break;

                case "B":
                    breadOption(scanner);
                    break;

                case "C":
                    toppingOption(scanner);
                    break;

                case "D":
                    break;

                case "0":
                    running = false;

                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
        scanner.close();
    }

    private static void sandwichSizeOption(Scanner scanner) {
        System.out.println("----- Enter Sandwich Size -----");
        System.out.println("A) 4 inch Price is: $5.50");
        System.out.println("B) 8 inch Price is: $7.00");
        System.out.println("C) 12 inch Price is: $8.50");

        String input = scanner.nextLine().trim();
    }

    private static void breadOption(Scanner scanner) {
        System.out.println("----- Enter Bread Type ----- ");
        System.out.println("A) White");
        System.out.println("B) Wheat");
        System.out.println("C) Rye");
        System.out.println("D) Wrap");

        String input = scanner.nextLine().trim();
    }

    private static void toppingOption(Scanner scanner) {
        System.out.println("----- Enter Toppings of Choice -----");
        System.out.println("Which Meat Would You Like?");
        System.out.println("Steak, Ham, Salami, Roast Beef, Chicken, Bacon");

        String input = scanner.nextLine().trim();
        
        if (input.equals("4 inch")) {
            System.out.println("Price: +$1.00");
        } else if (input.equals("8inch")) {
            System.out.println("Price: +$2.00");
        } else if (input.equals("12inch")) {
            System.out.println("Price: +$3.00");
        }

    }


        private static void addDrink (Scanner scanner){
            boolean running = true;
            while (running) {
                System.out.println("A) Select Drink Size: ");
                System.out.println("B) Select Drink Flavor: ");

                String input = scanner.nextLine().trim();


            }
        }

        private static void addChips (Scanner scanner){
            boolean running = true;
            while (running) {
                System.out.println("A) Select Chips Type:");

                String input = scanner.nextLine().trim();


            }
        }

        private static void checkout (Scanner scanner){
            boolean running = true;
            while (running) {
                System.out.println("A) Select Chips Type:");

                String input = scanner.nextLine().trim();


            }


        }
    }




