package com.yearup.deli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== Welcome to the DELI-cious Home Screen =====");
            System.out.println("Choose an option: ");
            System.out.println("1) New Order");
            System.out.println("2) Exit");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    newOrder(scanner);
                    break;

                case 2:
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
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    addSandwich(scanner);
                    break;

                case 2:
                    addDrink(scanner);
                    break;

                case 3:
                    addChips(scanner);
                    break;

                case 4:
                    checkout(scanner);
                    break;

                case 5:
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
            System.out.println("1) Select Sandwich Size: ");
            System.out.println("2) Select Bread: ");
            System.out.println("3) Select Toppings: ");
            System.out.println("4) Toasted? y/n");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    sandwichSizeOption(scanner);
                    break;

                case 2:
                    breadOption(scanner);
                    break;

                case 3:
                    toppingOption(scanner);
                    break;

                case 4:
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
        System.out.println("1) 4 inch Price is: $5.50");
        System.out.println("2) 8 inch Price is: $7.00");
        System.out.println("3) 12 inch Price is: $8.50");

        int input = scanner.nextInt();
    }

    private static void breadOption(Scanner scanner) {
        System.out.println("----- Enter Bread Type ----- ");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");

        int input = scanner.nextInt();
    }

    private static void toppingOption(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("----- Enter Toppings of Choice -----");
            System.out.println("Which Meat Would You Like?");
            System.out.println("1) Steak");
            System.out.println("2) Ham");
            System.out.println("3) Salami");
            System.out.println("4) Roast Beef");
            System.out.println("5) Chicken");
            System.out.println("6) Bacon");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    sandwichSizeOption(scanner);
                    break;

                case 2:
                    breadOption(scanner);
                    break;

                case 3:
                    toppingOption(scanner);
                    break;

                case 4:
                    running = false;

                default:
                    System.out.println("Invalid Option");
                    break;
            }

            String input1 = scanner.nextLine().trim();

            if (input1.equals("4 inch")) {
                System.out.println("Price: +$1.00");
            } else if (input1.equals("8inch")) {
                System.out.println("Price: +$2.00");
            } else if (input1.equals("12inch")) {
                System.out.println("Price: +$3.00");
            }

        }
    }


        private static void addDrink (Scanner scanner) {
            boolean running = true;
            while (running) {
                System.out.println("----- Select Drinks -----");
                System.out.println("1) Coca Cola");
                System.out.println("2) Pepsi");
                System.out.println("3) Sprite");
                System.out.println("4) Fanta");
                System.out.println("5) Water");

                int input = scanner.nextInt();
                int selection = scanner.nextInt();

                switch (selection) {
                    case 1:

                }


            }
        }



        private static void addChips (Scanner scanner){
            boolean running = true;
            while (running) {
                System.out.println("1) Select Chips Type:");

                String input = scanner.nextLine().trim();


            }
        }

        private static void checkout (Scanner scanner){
            boolean running = true;
            while (running) {





            }


        }
    }




