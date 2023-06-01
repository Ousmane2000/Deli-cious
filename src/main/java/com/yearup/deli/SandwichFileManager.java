package com.yearup.deli;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class SandwichFileManager {
    public void saveOrder(String name,ArrayList<Item> receipt) {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String formattedDateTime = dateFormat.format(currentDate);
        double total = 0;
        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter(formattedDateTime + ".txt"));
            writer.write("Receipt for " + name + ": \n ");
            for (Item item: receipt){
                if(item instanceof Sandwich){
                    writer.write("---Sandwich: \n ");
                    writer.write(String.valueOf(item));
                }
                if (item instanceof Drinks){
                    writer.write("---Drink: \n ");
                    writer.write(String.valueOf(item));
                }
                if (item instanceof Chips){
                    writer.write("---Chips: \n ");
                    writer.write(String.valueOf(item));
                }
                total += item.calculatePrice();
                writer.write("/n");
            }
            writer.write("Total is: " + total );
            writer.close();
        }catch(IOException e){
            System.out.println("Couldn't make receipt");
        }
    }
}
