package edu.jacob.gof.abstractfactory;

import edu.jacob.gof.abstractfactory.country.Country;
import edu.jacob.gof.abstractfactory.state.State;

public abstract class AbstractFactory {

    public abstract Country getCountry(String country);

    public abstract State getState(String state);
}
