package com.umaraliev.patterns.structuralPatterns.decorator;

public class CarDecorator implements Car{
    protected Car decorated;
    public CarDecorator(Car decorated){
        this.decorated = decorated;
    }
    @Override
    public void draw() {
        decorated.draw();
    }
}
