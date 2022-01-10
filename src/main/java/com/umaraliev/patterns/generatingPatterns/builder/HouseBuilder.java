package com.umaraliev.patterns.generatingPatterns.builder;

public abstract class HouseBuilder {
    House house;

    void createHom(){
        house = new House();
    }

    abstract void windowsBuilder();
    abstract void roofBuilder();
    abstract void doorsBuilder();
    abstract void garageBuilder();
    abstract void wallsBuilder();

    House getHouse(){
        return house;
    }
}
