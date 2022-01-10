package com.umaraliev.patterns.structuralPatterns.Bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car unknownCar = new UnknownCar(new UnknownEngine());
        unknownCar.setEngine();
    }
}
