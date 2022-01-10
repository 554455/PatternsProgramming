package com.umaraliev.patterns.behavioralPatterns.state;

public class StartPlay implements State {
    @Override
    public void doAction() {
        System.out.println("start play");
    }
}
