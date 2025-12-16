package com.klu.ifm.io;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.klu.ifm.Item;

public class ItemFileHandlerWriter {
	 // Write Items From file
	 public static void writeItems(String fileName, List<Item> items) {
	        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
	            pw.println("itemId,name,threshold");
	            for (Item item : items) {
	                pw.println(item.getItemId() + "," + item.getName() + "," + item.getThreshold());
	            }
	        } catch (IOException e) {
	            System.out.println("File write error: " + e.getMessage());
	        }
	    }
}
