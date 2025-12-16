
package com.klu.ifm.strategy;

abstract class Item {
    abstract void display();
}

class Laptop extends Item {
    void display() {
        System.out.println("Laptop in stock.");
    }
}

class Mobile  extends Item {
    void display() {
        System.out.println("Mobile in stock.");
    }
}
