package com.umaraliev.patterns.behavioralPatterns.chainofResponsibility;

public class VisaPayment implements Payment{

    private Payment payment;

    public void setNext(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay() {
        System.out.println("Visa Payment");
    }
}
