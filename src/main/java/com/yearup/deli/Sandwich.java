package com.yearup.deli;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sandwich extends Item {
    private int sizeSandwich;
    private String typeOfBread;
    private double price_sandwich;
    private String meat_topping;
    private String cheese_topping;
    private boolean extra_meat;
    private boolean extra_cheese;
    private boolean toasted;
    private ArrayList<String> toppings;
    private ArrayList<String> list_sauces;

    public Sandwich(String name, double price_sandwich) {
        super(name, price_sandwich);
    }
}
