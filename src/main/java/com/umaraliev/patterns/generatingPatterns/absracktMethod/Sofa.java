package com.umaraliev.patterns.generatingPatterns.absracktMethod;

public class Sofa implements SofaInterface{
    @Override
    public void artDecoSofa() {
        System.out.println("Sofa art deco");
    }

    @Override
    public void victorianSofa() {
        System.out.println("Sofa victorian");
    }
}
