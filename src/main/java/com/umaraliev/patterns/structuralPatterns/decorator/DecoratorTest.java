package com.umaraliev.patterns.structuralPatterns.decorator;

public class DecoratorTest {//ัะตัั
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car blueUnknownCar = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println();
        blueUnknownCar.draw();
    }
}
