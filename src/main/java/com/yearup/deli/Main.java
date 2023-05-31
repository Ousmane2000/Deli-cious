package com.yearup.deli;

import java.util.Scanner;

public class Main {
    static Person customer = new Person();
    static Sandwich sandwich = new Sandwich();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== Welcome to the DELI-cious Home Screen =====");
            System.out.println("What is your name?");
            String name = scanner.next();
            customer.setName(name);
            customer.setReceipt();
            customer.addItem(sandwich);
            sandwich.setToasted(false);
            sandwich.setExtra_meat(false);
            sandwich.setExtra_cheese(false);
            System.out.println("Hello " + name + " Choose an option: ");
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

                case 0:
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
            System.out.println("3) Select Meat Choice: ");
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
                    meatOption(scanner);
                    break;

                case 4:
                    System.out.println("Do you want your sandwich toasted? Y/N");
                    String toasted = scanner.next();
                    if(toasted.equalsIgnoreCase("y") || toasted.equalsIgnoreCase("yes")){
                        sandwich.setToasted(true);
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
        scanner.close();
    }

    private static void sandwichSizeOption(Scanner scanner) {
        int option = 0;
        System.out.println("----- Enter Sandwich Size -----");
        System.out.println("1) 4 inch Price is: $5.50");
        System.out.println("2) 8 inch Price is: $7.00");
        System.out.println("3) 12 inch Price is: $8.50");

        int input = scanner.nextInt();
        switch(input){
            case 1:
                option = 4;
                break;
            case 2:
                option = 8;
                break;
            case 3:
                option = 12;
                break;
            default:
                System.out.println("The option you entered doesn't work");
                break;
        }
        sandwich.setSize_sandwich(option);
    }

    private static void breadOption(Scanner scanner) {
        String option = null;
        System.out.println("----- Enter Bread Type ----- ");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");

        int input = scanner.nextInt();
        switch(input){
            case 1:
                option = "White";
                break;
            case 2:
                option = "Wheat";
                break;
            case 3:
                option = "Rye";
                break;
            case 4:
                option = "Wrap";
                break;
            default:
                System.out.println("The option you entered doesn't work");
                break;
        }
        sandwich.setType_of_bread(option);
    }

    private static void meatOption(Scanner scanner) {
        String meat = null;
            System.out.println("----- Enter Toppings of Choice -----");
            System.out.println("Which Meat Would You Like?");
            System.out.println("1) Steak");
            System.out.println("2) Ham");
            System.out.println("3) Salami");
            System.out.println("4) Bacon");
            System.out.println("5) Roast Beef");
            System.out.println("6) Chicken");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    meat = "Steak";
                    break;
                case 2:
                    meat = "Ham";
                    break;
                case 3:
                    meat = "Salami";
                    break;
                case 4:
                    meat = "Bacon";
                    break;
                case 5:
                    meat = "Roast Beef";
                    break;
                case 6:
                    meat ="Chicken";
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
            System.out.println();
            sandwich.setMeat_topping(meat);
    }
        private static void addDrink (Scanner scanner) {
            boolean exit = false;
            String drinkSize = "";
            String drinkType = "";
            while (!exit) {
                System.out.println("----- Select Drinks -----");
                System.out.println("1) Coca Cola");
                System.out.println("2) Pepsi");
                System.out.println("3) Sprite");
                System.out.println("4) Fanta");
                System.out.println("5) Water");
                System.out.println("0) Exit");

                int selection = scanner.nextInt();

                switch (selection) {
                    case 1:
                        drinkType = "Coca Cola";
                        System.out.print("Which size would you like (Small, Medium, Large)");
                        drinkSize = scanner.nextLine();
                        break;

                    case 2:
                        drinkType = "Pepsi";
                        System.out.print("Which size would you like (Small, Medium, Large");
                        drinkSize = scanner.nextLine();
                        break;

                    case 3:
                        drinkType = "Sprite";
                        System.out.print("Which size would you like (Small, Medium, Large");
                        drinkSize = scanner.nextLine();
                        break;

                    case 4:
                        drinkType = "Fanta";
                        System.out.print("Which size would you like (Small, Medium, Large");
                        drinkSize = scanner.nextLine();
                        break;

                    case 5:
                        drinkType = "Water";
                        System.out.print("Which size would you like (Small, Medium, Large");
                        drinkSize = scanner.nextLine();
                        break;

                    case 0:
                        System.out.print("Returning To Menu");
                        break;

                    default:
                        System.out.print("Invalid Option");
                        break;
                }
                Drinks drink = new Drinks(drinkType,drinkSize);
                customer.addItem(drink);
            }
        }
        private static void addChips (Scanner scanner){
            String name = null;
            boolean running = true;
            while (running) {
                System.out.println("----- Select Chips -----");
                System.out.println("1) Doritos");
                System.out.println("2) Lays");
                System.out.println("3) Cheetos");
                System.out.println("4) Fritos");
                System.out.println("5) Funyuns");
                System.out.println("6) Ruffles");
                System.out.println("7) Tostitos");
                System.out.println("10) Exit");

                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        name = "Doritos";
                        break;
                    case 2:
                        name = "Lays";
                        break;
                    case 3:
                        name = "Cheetos";
                        break;
                    case 4:
                        name = "Fritos";
                        break;
                    case 5:
                        name = "Funyuns";
                        break;
                    case 6:
                        name = "Ruffles";
                        break;
                    case 7:
                        name = "Tostitos";
                        break;
                    case 10:
                        break;
                    default:
                        System.out.println("This isn't an option");
                }
                Chips chip = new Chips(name);
                customer.addItem(chip);
            }
        }

        private static void checkout (Scanner scanner){
            boolean running = true;
            while (running) {





            }


        }
    }




