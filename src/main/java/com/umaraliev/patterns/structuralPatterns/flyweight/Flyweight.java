package com.umaraliev.patterns.structuralPatterns.flyweight;

public class Flyweight {
    private int row;
    public Flyweight(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }
    void report(int col) {
        System.out.print(" " + row + col);
    }
}
