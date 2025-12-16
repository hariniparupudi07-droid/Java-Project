package com.klu.ifm;

import com.klu.ifm.Item;
import com.klu.ifm.exception.InvalidItemException;

public class Demo {

    public static void main(String[] args) {

        try {
            Item item1 = new Item("E211","Laptop",150);
            item1.display();

            Item item2 = new Item("e21122","Tablet",200);
            item2.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}