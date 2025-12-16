package com.klu.ifm;
public class Item {
    private String itemId;
    private String name;
    private int threshold;

    public Item(String itemId, String name, int threshold) {
        this.itemId = itemId;
        this.name = name;
        this.threshold = threshold;
    }

    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public int getThreshold() { return threshold; }
}

	

