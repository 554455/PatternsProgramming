package com.umaraliev.patterns.structuralPatterns.composite;

public class UnknownCar implements Car {
    public void draw(String color) {
        System.out.println("UnknownCar color: " + color);
    }
}
