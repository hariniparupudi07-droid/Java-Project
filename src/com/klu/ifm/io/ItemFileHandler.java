package com.klu.ifm.io;

import com.klu.ifm.Item;
import java.io.*;
import java.util.*;

public class ItemFileHandler {

    public static List<Item> readItems(String fileName) {
        List<Item> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue; 

                String[] data = line.split(",");
                if (data.length < 3) continue;

                String itemId = data[0].trim();
                String name = data[1].trim();
                int threshold = Integer.parseInt(data[2].trim());

                items.add(new Item(itemId, name, threshold));
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("File read error: " + e.getMessage());
        }

        return items;
    }

	public static void writeItems(String string, List<Item> items) {
		// TODO Auto-generated method stub
		
	}

   
}


