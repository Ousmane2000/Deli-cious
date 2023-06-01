package com.yearup.deli;

public class Drinks extends Item{
    private String drink_size;
    private double drink_price;
    private String drink_name;

    public Drinks(String name, String drink_size) {
        this.drink_name = name;
        this .drink_size = drink_size;
    }
    public Drinks(){

    }
    public String getDrink_size() {
        return drink_size;
    }

    public double calculatePrice() {
        if(drink_size.equalsIgnoreCase("Small")){
            return 2.00;
        }
        if(drink_size.equalsIgnoreCase("Medium")){
            return 2.50;
        }
        if(drink_size.equalsIgnoreCase("Large")){
            return 3.00;
        }
        return 0;
    }

    @Override
    public String toString() {

        return "Drinks:" + "\n" +
                "drink_size= " + drink_size + "\n" +
                ", drink_name= " + drink_name ;
    }
}
