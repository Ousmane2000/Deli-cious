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
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(date + "-" + time+ ".txt"));
            writer.write("Receipt for " + name + ":");
            for (Item item: receipt){
                if(item instanceof Sandwich){
                    writer.write("");
                }
            }

        }catch(IOException e){
            System.out.println("Couldn't make receipt");
        }
    }
    public static void main(String[] args) {

    }
}
