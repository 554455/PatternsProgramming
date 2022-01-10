package com.umaraliev.patterns.generatingPatterns.builder;

public class HouseCreate extends HouseBuilder{

    void windowsBuilder() {
        house.setWindows(4);
    }

    @Override
    void roofBuilder() {
        house.setRoof("roof");
    }

    @Override
    void doorsBuilder() {
        house.setDoors("doors");
    }

    @Override
    void garageBuilder() {
        house.setGarage("doors");
    }

    @Override
    void wallsBuilder() {
        house.setWalls("walls");
    }
}
