package com.yearup.deli;

public class Chips extends Item{
    private String type_chips;
    public Chips(String name){
        this.type_chips = name;
    }
    public Chips(){

    }

    public String getType_chips() {
        return type_chips;
    }

    @Override
    public double calculatePrice() {

        return 1.50;
    }

    @Override
    public String toString() {
        return "Chips:" + type_chips ;
    }
}
