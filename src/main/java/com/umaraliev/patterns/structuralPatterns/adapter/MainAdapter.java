package com.umaraliev.patterns.structuralPatterns.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        PBank pbank = new PBank();
        pbank.getBalance();
        PBankAdapter abank = new PBankAdapter(new ABank());
        abank.getBalance();
    }
}
