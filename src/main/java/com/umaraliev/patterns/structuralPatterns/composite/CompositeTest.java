package com.umaraliev.patterns.structuralPatterns.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car unknownCar = new UnknownCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("green");
        drawing.clear();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("white");
    }   
}
