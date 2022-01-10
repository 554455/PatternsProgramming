package com.umaraliev.patterns.generatingPatterns.absracktMethod;

public class Armchair implements ArmchairInterface {
    @Override
    public void artDecoArmchair() {
        System.out.println("Armchair art deco");
    }

    @Override
    public ArmchairInterface victorianArmchair() {
        System.out.println("Armchair victorian");
        return null;
    }
}
