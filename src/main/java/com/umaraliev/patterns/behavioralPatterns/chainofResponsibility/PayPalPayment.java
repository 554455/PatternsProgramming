package com.umaraliev.patterns.behavioralPatterns.chainofResponsibility;

public class PayPalPayment implements Payment{

    private Payment payment;

    public void setNext(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay() {
        System.out.println("PayPal Payment");
    }
}
