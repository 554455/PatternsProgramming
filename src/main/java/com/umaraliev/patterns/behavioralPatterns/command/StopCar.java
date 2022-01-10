package com.umaraliev.patterns.behavioralPatterns.command;

public class StopCar implements Command{

    Car car;

    public StopCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }
}
