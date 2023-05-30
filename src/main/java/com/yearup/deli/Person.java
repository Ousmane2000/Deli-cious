package com.yearup.deli;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Item> receipt;

    public Person(String name, ArrayList<Item> receipt) {
        this.name = name;
        this.receipt = receipt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getReceipt() {
        return receipt;
    }

    public void setReceipt(ArrayList<Item> receipt) {
        this.receipt = receipt;
    }
}
