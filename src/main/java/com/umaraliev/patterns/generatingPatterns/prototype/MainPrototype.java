package com.umaraliev.patterns.generatingPatterns.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(Type.ONE);
    }
}
