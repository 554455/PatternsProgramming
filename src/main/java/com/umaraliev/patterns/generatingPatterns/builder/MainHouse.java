package com.umaraliev.patterns.generatingPatterns.builder;

public class MainHouse {
    public static void main(String[] args) {
        Director director = new Director();
        director.setHouseBuilder(new HouseCreate());

        House house = director.getHouse();

        System.out.println(house);
    }
}
