package com.umaraliev.patterns.generatingPatterns.prototype;


public class ComplicatedObject implements Copyable {

    private Type type;

    @Override
    public ComplicatedObject copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject();
        return complicatedobject;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
