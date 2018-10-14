package edu.jacob.gof.abstractfactory;

import edu.jacob.gof.abstractfactory.country.Country;
import edu.jacob.gof.abstractfactory.country.India;
import edu.jacob.gof.abstractfactory.country.UK;
import edu.jacob.gof.abstractfactory.country.USA;
import edu.jacob.gof.abstractfactory.state.State;

public class CountryFactory extends AbstractFactory {



    @Override
    public Country getCountry(String country) {

        if(country.equalsIgnoreCase("India")) {
            return new India();
        }

        if(country.equalsIgnoreCase("USA")) {
            return new USA();
        }

        if(country.equalsIgnoreCase("UK")) {
            return new UK();
        }

        return null;
    }

    @Override
    public State getState(String state) {
        return null;
    }
}
