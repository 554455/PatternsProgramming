package com.umaraliev.patterns.generatingPatterns.factoryMethod;

public class Ship implements Transport{
    @Override
    public void delivery() {
        System.out.println("We will deliver by sea");
    }
}
