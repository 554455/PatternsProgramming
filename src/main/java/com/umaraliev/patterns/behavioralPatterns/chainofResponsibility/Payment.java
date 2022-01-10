package com.umaraliev.patterns.behavioralPatterns.chainofResponsibility;

public interface Payment {
    void setNext(Payment payment);
    void pay();
}
