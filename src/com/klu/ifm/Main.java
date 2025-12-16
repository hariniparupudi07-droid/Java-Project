package com.klu.ifm;

import com.klu.ifm.InventoryTest ;
import com.klu.ifm.exception.LowStockException;

public class Main {
    public static void main(String[] args) {

        InventoryTracking inv = new InventoryTracking(150);

        try {
            inv.checkStockLimit();
            System.out.println("Stock level is Insufficient.Please Restock!!");
        }
        catch(Exception e) {
        	
        	System.out.println(e);
        }
        finally {
            System.out.println("Stock check process completed");
        }
    }
}
