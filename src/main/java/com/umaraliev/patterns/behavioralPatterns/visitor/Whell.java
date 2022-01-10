package com.umaraliev.patterns.behavioralPatterns.visitor;

public class Whell implements Car {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
