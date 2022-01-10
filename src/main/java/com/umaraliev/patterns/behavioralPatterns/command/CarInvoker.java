package com.umaraliev.patterns.behavioralPatterns.command;

public class CarInvoker {

    public Command command;

    public CarInvoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
