package com.umaraliev.patterns.generatingPatterns.absracktMethod;

public class Victorian implements VictorianInterface{
    @Override
    public ArmchairInterface getVictorianArmchair() {
        return new Armchair().victorianArmchair();
    }

    @Override
    public SofaInterface getVictorianSofa() {
        return null;
    }

    @Override
    public TableInterface getVictorianTable() {
        return null;
    }
}
