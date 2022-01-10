package com.umaraliev.patterns.generatingPatterns.singleton;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
