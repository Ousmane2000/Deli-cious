package com.yearup.deli;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Item> receipt;

    public Person(String name) {
        this.name = name;
        this.receipt = new ArrayList<>();
    }
    public Person(){

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
    public void addItem(Item item){
        receipt.add(item);
    }
    public void setReceipt() {
        this.receipt = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
