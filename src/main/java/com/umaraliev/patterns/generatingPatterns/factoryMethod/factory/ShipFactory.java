package com.umaraliev.patterns.generatingPatterns.factoryMethod.factory;

import com.umaraliev.patterns.generatingPatterns.factoryMethod.Ship;
import com.umaraliev.patterns.generatingPatterns.factoryMethod.Transport;

public class ShipFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
