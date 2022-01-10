package com.umaraliev.patterns.generatingPatterns.builder;

public class Director {
    HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    House getHouse(){
        houseBuilder.createHom();
        houseBuilder.getHouse();
        houseBuilder.doorsBuilder();
        houseBuilder.roofBuilder();
        houseBuilder.wallsBuilder();
        houseBuilder.windowsBuilder();

        House house = houseBuilder.getHouse();

        return house;
    }
}
