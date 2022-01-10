package com.umaraliev.patterns.behavioralPatterns.command;

public class StartCar implements Command {

    Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
