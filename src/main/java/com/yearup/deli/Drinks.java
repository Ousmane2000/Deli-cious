package com.yearup.deli;

public class Drinks extends Item{
    private String drink_size;
    private double drink_price;

    public Drinks(String name, double drink_price) {
        super(name, drink_price);
    }

    public String getDrink_size() {
        return drink_size;
    }

    public double getDrink_price() {
        return drink_price;
    }

}
