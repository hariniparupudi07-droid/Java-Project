package com.klu.ifm;

public class InventoryTracking {
	int currentStock;
	public InventoryTracking(int initialStock) {
		this.currentStock=initialStock;
		
	}
	public void updateStock(int quantityChange) {
		this.currentStock+=quantityChange;
		
		System.out.println("Updated Current Stock:"+currentStock);
	}
	public boolean getcurrentStock(int thersold) {
		 return currentStock <= thersold;
		
	}
	public boolean checkReorder() {
		if(currentStock<200) {
			System.out.println("Need to Restock the Item!");
			return true;
		}else {
			return false;
		}
}
	public int getCurrentStock() {
	return currentStock;
}
	public void checkStockLimit() {
		// TODO Auto-generated method stub
		
	}
}