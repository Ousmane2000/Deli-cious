package com.yearup.deli;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class SandwichFileManager {
    public void saveOrder(Person name,ArrayList<Item> receipt) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        double total = 0;
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(date + "-" + time+ ".txt"));
            writer.write("Receipt for " + name + ":");
            for (Item item: receipt){
                if(item instanceof Sandwich){
                    writer.write("---Sandwich: ");
                    writer.write(((Sandwich) item).getSize_sandwich() + " inch Sandwich");
                    writer.write(((Sandwich) item).getType_of_bread() + " Bread");
                    writer.write(((Sandwich) item).getMeat_topping());
                    if (((Sandwich) item).isExtra_meat()){
                        writer.write("w/ extra meat");
                    }
                    writer.write(((Sandwich) item).getCheese_topping());
                    if (((Sandwich) item).isExtra_cheese()){
                        writer.write("w/ extra cheese");
                    }
                    if (((Sandwich) item).isToasted()){
                        writer.write("toasted");
                    }
                    writer.write(((Sandwich) item).getSize_sandwich());
                    for(String toppings: ((Sandwich) item).getToppings()){
                        writer.write(toppings + "\n");
                    }
                    for(String sauces: ((Sandwich) item).getList_sauces()){
                        writer.write(sauces + "\n");
                    }
                }
                if (item instanceof Drinks){
                    writer.write("---Drink: ");
                    writer.write(((Drinks)item).getName());
                    writer.write(((Drinks)item).getDrink_size());
                }
                if (item instanceof Chips){
                    writer.write("---Chips: ");
                    writer.write(((Chips)item).getName());
                }
                total += item.calculatePrice();
            }
            writer.write("Total is: " + total );
            writer.close();
        }catch(IOException e){
            System.out.println("Couldn't make receipt");
        }
    }
    public static void main(String[] args) {

    }
}
