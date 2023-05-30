package com.yearup.deli;

public class Drinks extends Item{
    private String drink_size;
    private double drink_price;
    private String drink_flavor;

    public Drinks(String name, double drink_price) {
        super(name, drink_price);
    }
}
