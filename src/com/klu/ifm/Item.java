package com.klu.ifm;

public class Item {

    private String itemId;
    private String name;
     int threshold;
    
    public Item(String itemId, String name) {
        this.itemId = itemId;
        this.name = name;
		this.threshold=threshold;
    }

   
    public Item(String itemId, String name, int threshold) {
		// TODO Auto-generated constructor stub
	}


	public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }
    public int getThreshold() {
    	return threshold;
    }
    @Override
    public String toString() {
        return itemId + " " + name;
    }


	public void display() {
		System.out.println(itemId+"--"+name+"---"+"threshold");
		
	}
}
