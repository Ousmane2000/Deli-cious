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
                    writer.write(String.valueOf(item));
                }
                if (item instanceof Drinks){
                    writer.write(String.valueOf(item));
                    writer.write("\n");
                }
                if (item instanceof Chips){
                    writer.write(String.valueOf(item));
                    writer.write("\n");
                }
                total += item.calculatePrice();
            }
            writer.write("Total is: $" + total );
            writer.close();
        }catch(IOException e){
            System.out.println("Couldn't make receipt");
        }
    }
}
