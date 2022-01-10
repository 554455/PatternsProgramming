package com.umaraliev.patterns.structuralPatterns.Bridge;

public class SportEngine implements Engine{
    @Override
    public void setEngine() {
        System.out.println("sport");
    }
}
