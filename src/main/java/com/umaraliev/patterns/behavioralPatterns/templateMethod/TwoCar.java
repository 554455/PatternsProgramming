package com.umaraliev.patterns.behavioralPatterns.templateMethod;

public class TwoCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Start engine.");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop engine.");
    }
}
