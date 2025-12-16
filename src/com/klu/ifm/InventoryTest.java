package com.klu.ifm;
import com.klu.ifm.InventoryTracking;

public class InventoryTest {
	    public static void main(String[] args) {

	        InventoryTracking item = new InventoryTracking(150);

	        item.getcurrentStock(300);
	  System.out.println("Final Stock: " + item.getcurrentStock(0));
	    
	}
}

