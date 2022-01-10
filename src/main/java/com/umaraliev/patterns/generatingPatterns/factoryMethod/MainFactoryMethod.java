package com.umaraliev.patterns.generatingPatterns.factoryMethod;

import com.umaraliev.patterns.generatingPatterns.factoryMethod.factory.ShipFactory;
import com.umaraliev.patterns.generatingPatterns.factoryMethod.factory.TransportFactory;
import com.umaraliev.patterns.generatingPatterns.factoryMethod.factory.TruckFactory;

public class MainFactoryMethod {
    public static void main(String[] args) {
        TransportFactory transportFactory = createDeliveryProducts("Fish");
        Transport transport = transportFactory.createTransport();
        transport.delivery();
    }

    private static TransportFactory createDeliveryProducts(String products) {
        if (products.equalsIgnoreCase("Fish")){
            return new ShipFactory();
        } else if (products.equalsIgnoreCase("Milk")) {
            return new TruckFactory();
        }else {
            throw new RuntimeException(products + " we do not supply such products");
        }
    }

}
