package com.klu.ifm.io;

import com.klu.ifm.Item;
import java.io.*;
import java.util.*;

public class ItemFileHandler {

    // READ ITEMS FROM CSV
    public static List<Item> readItems(String fileName) {
        List<Item> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                // Only itemId and name
                items.add(new Item(data[0], data[1]));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return items;
    }

    // WRITE ITEMS TO CSV
    public static void writeItems(String fileName, List<Item> items) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            for (Item item : items) {
                bw.write(item.getItemId() + "," + item.getName());
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}