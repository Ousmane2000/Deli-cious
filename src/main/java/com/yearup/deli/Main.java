package com.yearup.deli;

import java.util.Scanner;

public class Main {
    static Person customer = new Person();
    static Sandwich sandwich = new Sandwich();
    static SandwichFileManager receipt = new SandwichFileManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== Welcome to the DELI-cious Home Screen =====");
            System.out.println("What is your name?");
            String name = scanner.nextLine();
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
            System.out.println("4) Add Sauces");
            System.out.println("5) Add Sides");
            System.out.println("6) Checkout");
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
                    saucesOption(scanner);
                    break;
                case 5:
                     sidesOption(scanner);
                    break;

                case 6:
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
            System.out.println("4) Toasted ");
            System.out.println("5) Cheese ");
            System.out.println("6) Add Toppings ");
            System.out.println("7) Exit");

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
                    System.out.println("Would you like extra meat with that? Y/N");
                    String extra = scanner.next();
                    if(extra.equalsIgnoreCase("y") || extra.equalsIgnoreCase("yes")){
                        sandwich.setExtra_meat(true);
                    }
                    break;

                case 4:
                    System.out.println("Do you want your sandwich toasted? Y/N");
                    String toasted = scanner.next();
                    if(toasted.equalsIgnoreCase("y") || toasted.equalsIgnoreCase("yes")){
                        sandwich.setToasted(true);
                    }
                    break;
                case 5:
                    addCheese(scanner);
                    System.out.println("Do you want extra cheese? Y/N");
                    String cheese = scanner.next();
                    if(cheese.equalsIgnoreCase("y") || cheese.equalsIgnoreCase("yes")){
                        sandwich.setExtra_cheese(true);
                    }
                    break;
                case 6:
                    addToppings(scanner);
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
    private static void addToppings(Scanner scanner){
        boolean run = true;
        while(run) {
            System.out.println("----- Enter Toppings -----");
        System.out.println("1) Lettuce");
        System.out.println("2) Peppers");
        System.out.println("3) Onions");
        System.out.println("4) Tomatoes");
        System.out.println("5) Jalepenos");
        System.out.println("6) Cucumbers");
        System.out.println("7) Pickles");
        System.out.println("8) Guacamole");
        System.out.println("9) Mushrooms");
        System.out.println("10) Exit");

        int toppings = scanner.nextInt();

        switch (toppings) {
            case 1:
                sandwich.addTopping("Lettuce");
                break;
            case 2:
                sandwich.addTopping("Peppers");
                break;
            case 3:
                sandwich.addTopping("Onions");
                break;
            case 4:
                sandwich.addTopping("Tomatoes");
                break;
            case 5:
                sandwich.addTopping("Jalapenos");
                break;
            case 6:
                sandwich.addTopping("Cucumbers");
                break;
            case 7:
                sandwich.addTopping("Pickles");
                break;
            case 8:
                sandwich.addTopping("Guacamole");
                break;
            case 9:
                sandwich.addTopping("Mushrooms");
                break;
            case 10:
                run = false;
                break;
            default:
                System.out.println("Invalid Option");
            }
        }
    }
    private static void addCheese(Scanner scanner) {
        String cheese = null;
        boolean run = true;
        while(run) {
            System.out.println("----- Enter Cheese -----");
            System.out.println("1) American");
            System.out.println("2) Provolone");
            System.out.println("3) Cheddar");
            System.out.println("4) Swiss");
            System.out.println("5) Exit");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    cheese = "American";
                    break;
                case 2:
                    cheese = "Provolone";
                    break;
                case 3:
                    cheese = "Cheddar";
                    break;
                case 4:
                    cheese = "Swiss";
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid, try again!. ");
            }
            sandwich.addCheese_topping(cheese);
        }
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
    private static void saucesOption(Scanner scanner) {
        String option = null;
        System.out.println("----- Enter Sauce Type ----- ");
        System.out.println("1) mayo");
        System.out.println("2) mustard");
        System.out.println("3) ketchup");
        System.out.println("4) ranch");
        System.out.println("5) thousand islands");
        System.out.println("6) vinaigrette");

        int input = scanner.nextInt();
        switch(input){
            case 1:
                option = "mayo";
                break;
            case 2:
                option = "mustard";
                break;
            case 3:
                option = "ketchup";
                break;
            case 4:
                option = "ranch";
                break;
            case 5:
                option = "thousand islands";
                break;
            case 6:
                option = "vinaigrette";
                break;
            default:
                System.out.println("The option you entered doesn't work");
                break;
        }
        sandwich.addSauce(option);;
    }
    private static void sidesOption(Scanner scanner) {
        String option = null;
        System.out.println("----- Enter Sides Type ----- ");
        System.out.println("1) au jus");
        System.out.println("2) sauce");

        int input = scanner.nextInt();
        switch(input){
            case 1:
                option = "au jus";
                break;
            case 2:
                option = "sauce";
                break;
            default:
                System.out.println("The option you entered doesn't work");
                break;
        }
        sandwich.setSides_option(option);
    }
    private static void meatOption(Scanner scanner) {
        String meat = null;
        boolean run = true;
        while (run) {
            System.out.println("----- Enter Toppings of Choice -----");
            System.out.println("Which Meat Would You Like?");
            System.out.println("1) Steak");
            System.out.println("2) Ham");
            System.out.println("3) Salami");
            System.out.println("4) Bacon");
            System.out.println("5) Roast Beef");
            System.out.println("6) Chicken");
            System.out.println("7) Exit");

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
                    meat = "Chicken";
                    break;
                case 7:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            sandwich.addMeat_topping(meat);
        }
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
                        drinkSize = scanner.next();
                        break;

                    case 2:
                        drinkType = "Pepsi";
                        System.out.print("Which size would you like (Small, Medium, Large)");
                        drinkSize = scanner.next();
                        break;

                    case 3:
                        drinkType = "Sprite";
                        System.out.print("Which size would you like (Small, Medium, Large)");
                        drinkSize = scanner.next();
                        break;

                    case 4:
                        drinkType = "Fanta";
                        System.out.print("Which size would you like (Small, Medium, Large)");
                        drinkSize = scanner.next();
                        break;

                    case 5:
                        drinkType = "Water";
                        System.out.print("Which size would you like (Small, Medium, Large)");
                        drinkSize = scanner.next();
                        break;

                    case 0:
                        System.out.print("Returning To Menu");
                        exit = true;
                        break;

                    default:
                        System.out.print("Invalid Option");
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
                        running = false;
                        break;
                    default:
                        System.out.println("This isn't an option");
                }
                Chips chip = new Chips(name);
                customer.addItem(chip);
            }
        }

        private static void checkout (Scanner scanner) {
        double owed = 0.0;
        double payment;
            for(Item items: customer.getReceipt()){
                if(items instanceof Sandwich){
                    System.out.println(items);
                    owed += items.calculatePrice();
                }
                if(items instanceof Drinks){
                    System.out.println(items);
                    owed += items.calculatePrice();
                }
                if(items instanceof Chips){
                    System.out.println(items);
                    owed += ((Chips)items).calculatePrice();
                }
            }

            do {
                System.out.println("The amount owed is " + owed);
                payment = scanner.nextDouble();
                if (payment >= owed) {
                    System.out.println("You have payed the correct amount, you have " + (payment + owed) + " in change, Enjoy and come again");
                    receipt.saveOrder(customer.getName(), customer.getReceipt());
                    break;
                }
                if(payment < owed){
                    System.out.println("Payment unsuccessful, please try again");
                }
            }while(payment < owed);

        }
    }




