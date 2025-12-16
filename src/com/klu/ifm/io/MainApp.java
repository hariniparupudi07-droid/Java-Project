package com.klu.ifm.io;

import com.klu.ifm.Item;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {

       
        List<Item> items = ItemFileHandler.readItems("items.csv");

        System.out.println("Items from file:");
        for (Item item : items) {
            System.out.println(item.getItemId() + " " + item.getName() + " " + item.getThreshold());
        }

        
        items.add(new Item("M2", "Mobile Pro", 120));

        
        ItemFileHandler.writeItems("items.csv", items);

        System.out.println("File updated successfully!");
    }
}

