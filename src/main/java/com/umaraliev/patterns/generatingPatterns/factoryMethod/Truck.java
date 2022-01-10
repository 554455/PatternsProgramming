package com.umaraliev.patterns.generatingPatterns.factoryMethod;

public class Truck implements Transport{
    @Override
    public void delivery() {
        System.out.println("We will deliver by cargo transport by land");
    }
}
