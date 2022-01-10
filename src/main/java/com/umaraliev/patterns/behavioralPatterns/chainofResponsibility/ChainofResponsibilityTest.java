package com.umaraliev.patterns.behavioralPatterns.chainofResponsibility;

public class ChainofResponsibilityTest {
    public static void main(String[] args) {
        Payment visaPayment = new VisaPayment();
        Payment payPalPayment = new PayPalPayment();
        visaPayment.setNext(payPalPayment);
        visaPayment.pay();
    }
}
