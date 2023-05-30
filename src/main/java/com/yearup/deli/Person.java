package com.yearup.deli;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Item> receipt;

    public Person(String name, ArrayList<Item> receipt) {
        this.name = name;
        this.receipt = receipt;
    }
}
