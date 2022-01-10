package com.umaraliev.patterns.behavioralPatterns.templateMethod;

public class OneCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Start engine.");
    }

    @Override
    void stopEngine() {
        System.out.println("stop engine.");
    }
}
