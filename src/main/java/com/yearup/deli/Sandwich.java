package com.yearup.deli;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class Sandwich extends Item {
    private int size_sandwich;
    private String type_of_bread;
    private double price_sandwich;
    private ArrayList<String> meat_topping;
    private ArrayList<String> cheese_topping;
    private boolean extra_meat;
    private boolean extra_cheese;
    private boolean toasted;
    private String sides_option;
    private String sauces_option;
    private ArrayList<String> toppings;
    private ArrayList<String> list_sauces;

    private double PRICE_4_INCH = 5.50;
    private double PRICE_8_INCH = 7.00;
    private double PRICE_12_INCH = 8.50;
    private double BASE_TOPPING_PRICE_4 = 1.00;
    private double BASE_TOPPING_PRICE_8 = 2.00;
    private double BASE_TOPPING_PRICE_12 = 3.00;
    private double EXTRA_MEAT_PRICE_4 = 0.50;
    private double EXTRA_MEAT_PRICE_8 = 1.00;
    private double EXTRA_MEAT_PRICE_12 = 1.50;
    private double CHEESE_PRICE_4 = 0.75;
    private double CHEESE_PRICE_8 = 1.50;
    private double CHEESE_PRICE_12 = 2.25;
    private double EXTRA_CHEESE_PRICE_4 = 0.30;
    private double EXTRA_CHEESE_PRICE_8 = 0.60;
    private double EXTRA_CHEESE_PRICE_12 = 0.90;


    public Sandwich(int sizeSandwich, String typeOfBread, double price_sandwich, String meat_topping, String cheese_topping, boolean extra_meat, boolean extra_cheese, boolean toasted, String sauces_option, String sides_option) {
        this.size_sandwich = sizeSandwich;
        this.type_of_bread = typeOfBread;
        this.price_sandwich = price_sandwich;
        this.meat_topping = new ArrayList<>();
        this.cheese_topping = new ArrayList<>();
        this.extra_meat = extra_meat;
        this.extra_cheese = extra_cheese;
        this.toasted = toasted;
        this.sauces_option = sauces_option;
        this.sides_option = sides_option;
        this.toppings = new ArrayList<>();
        this.list_sauces = new ArrayList<>();
    }
    public Sandwich(){
        this.toppings = new ArrayList<>();
        this.list_sauces = new ArrayList<>();
        this.meat_topping = new ArrayList<>();
        this.cheese_topping = new ArrayList<>();
    }

    public void setSize_sandwich(int size_sandwich) {
        this.size_sandwich = size_sandwich;
    }

    public void setType_of_bread(String type_of_bread) {
        this.type_of_bread = type_of_bread;
    }

    public void setPrice_sandwich(double price_sandwich) {
        this.price_sandwich = price_sandwich;
    }

    public void addMeat_topping(String meat) {
        meat_topping.add(meat);
    }

    public void addCheese_topping(String cheese) {
        cheese_topping.add(cheese);
    }

    public void setExtra_meat(boolean extra_meat) {
        this.extra_meat = extra_meat;
    }

    public void setExtra_cheese(boolean extra_cheese) {
        this.extra_cheese = extra_cheese;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public int getSize_sandwich() {
        return size_sandwich;
    }

    public String getType_of_bread() {
        return type_of_bread;
    }

    public double getPrice_sandwich() {
        return price_sandwich;
    }

    public ArrayList<String> getMeat_topping() {
        return meat_topping;
    }

    public ArrayList<String> getCheese_topping() {
        return cheese_topping;
    }

    public boolean isExtra_meat() {
        return extra_meat;
    }

    public boolean isExtra_cheese() {
        return extra_cheese;
    }

    public boolean isToasted() {
        return toasted;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public ArrayList<String> getList_sauces() {
        return list_sauces;
    }

    public String getSides_option() {
        return sides_option;
    }

    public void setSides_option(String sides_option) {
        this.sides_option = sides_option;
    }

    public String getSauces_option() {
        return sauces_option;
    }

    public void setSauces_option(String sauces_option) {
        this.sauces_option = sauces_option;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }
    public void addSauce(String sauce) {
        list_sauces.add(sauce);
    }

    public double calculatePrice() {
        double price = 0.0;
        switch (size_sandwich) {
            case 4:
                price += PRICE_4_INCH;
                price += toppings.size() * BASE_TOPPING_PRICE_4;
                break;
            case 8:
                price += PRICE_8_INCH;
                price += toppings.size() * BASE_TOPPING_PRICE_8;
                break;
            case 12:
                price += PRICE_12_INCH;
                price += toppings.size() * BASE_TOPPING_PRICE_12;
                break;
            default:
                break;
        }
        if ((toppings.contains("steak") || toppings.contains("ham") || toppings.contains("salami") ||
                toppings.contains("roast beef") || toppings.contains("chicken") || toppings.contains("bacon")) & size_sandwich == 4 ){
            price += BASE_TOPPING_PRICE_4;
        }

        if ((toppings.contains("american") || toppings.contains("provolone") || toppings.contains("cheddar") ||
                toppings.contains("swiss")) & size_sandwich == 4 ) {
            price += CHEESE_PRICE_4;
        }
        if((extra_meat) & (size_sandwich == 4)) {
            price += EXTRA_MEAT_PRICE_4;
        }
        if ((toppings.contains("steak") || toppings.contains("ham") || toppings.contains("salami") ||
                toppings.contains("roast beef") || toppings.contains("chicken") || toppings.contains("bacon")) & size_sandwich == 8 ){
            price += BASE_TOPPING_PRICE_8;
        }

        if ((toppings.contains("american") || toppings.contains("provolone") || toppings.contains("cheddar") ||
                toppings.contains("swiss")) & size_sandwich == 8 ) {
            price += CHEESE_PRICE_8;
        }
        if((extra_meat) & (size_sandwich == 8)) {
            price += EXTRA_MEAT_PRICE_8;
        }
        if ((toppings.contains("steak") || toppings.contains("ham") || toppings.contains("salami") ||
                toppings.contains("roast beef") || toppings.contains("chicken") || toppings.contains("bacon")) & size_sandwich == 12 ){
            price += BASE_TOPPING_PRICE_12;
        }

        if ((toppings.contains("american") || toppings.contains("provolone") || toppings.contains("cheddar") ||
                toppings.contains("swiss")) & size_sandwich == 12 ) {
            price += CHEESE_PRICE_12;
        }
        if((extra_meat = true) & (size_sandwich == 12)) {
            price += EXTRA_MEAT_PRICE_12;
        }

        return price;
    }

    @Override
    public String toString() {
        return "Sandwich:" + "\n" +
                "size = " + size_sandwich + "\n" +
                "type of bread = " + type_of_bread + '\'' + "\n" +
                "meat = " + meat_topping + "\n" +
                "cheese = " + cheese_topping + "\n" +
                "extra meat = " + extra_meat + "\n" +
                "extra cheese = " + extra_cheese + "\n" +
                "toasted = " + toasted + "\n" +
                "toppings = " + toppings + "\n" +
                "list_sauces = " + list_sauces;
    }
}
