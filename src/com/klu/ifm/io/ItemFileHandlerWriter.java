package com.klu.ifm.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.klu.ifm.Item;

public class ItemFileHandlerWriter {
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

