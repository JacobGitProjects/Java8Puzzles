package edu.jacob.gof.abstractfactory;

import edu.jacob.gof.abstractfactory.country.Country;
import edu.jacob.gof.abstractfactory.state.APState;
import edu.jacob.gof.abstractfactory.state.State;
import edu.jacob.gof.abstractfactory.state.TSState;

public class StateFactory extends AbstractFactory {
    @Override
    public Country getCountry(String country) {
        return null;
    }

    @Override
    public State getState(String state) {

        if(state.equalsIgnoreCase("AP")) {
            return new APState();
        }

        if(state.equalsIgnoreCase("TS")) {
            return new TSState();
        }

        return null;
    }
}
