package edu.jacob.gof.abstractfactory.state;

public class APState implements State {
    @Override
    public String getArea() {
        return "10,00,000 AP area";
    }

    @Override
    public String getCapital() {
        return "Amaravati";
    }

    @Override
    public String stateHeadName() {
        return "Chandrababu Naidu";
    }

    @Override
    public double stateBudget() {
        return 1000000;
    }

    @Override
    public String stateName() {
        return "AP";
    }
}
