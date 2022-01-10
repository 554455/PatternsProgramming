package com.umaraliev.patterns.generatingPatterns.factoryMethod.factory;

import com.umaraliev.patterns.generatingPatterns.factoryMethod.Transport;
import com.umaraliev.patterns.generatingPatterns.factoryMethod.Truck;

public class TruckFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
