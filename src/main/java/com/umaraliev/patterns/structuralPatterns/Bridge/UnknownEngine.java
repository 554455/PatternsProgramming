package com.umaraliev.patterns.structuralPatterns.Bridge;

public class UnknownEngine implements Engine{
    @Override
    public void setEngine() {
        System.out.println("unknown");
    }
}
