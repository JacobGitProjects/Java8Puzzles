package edu.jacob.gof.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if(choice.equalsIgnoreCase("Country")) {
            return new CountryFactory();
        } else if(choice.equalsIgnoreCase("State")) {
            return new StateFactory();
        }

        return null;
    }

}
