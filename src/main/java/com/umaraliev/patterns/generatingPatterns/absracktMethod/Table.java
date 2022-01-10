package com.umaraliev.patterns.generatingPatterns.absracktMethod;

public class Table implements TableInterface{
    @Override
    public void artDecoTable() {
        System.out.println("Table art deco");
    }

    @Override
    public void victorianTable() {
        System.out.println("Victorian victorian");
    }
}
