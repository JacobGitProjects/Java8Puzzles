package edu.jacob.gof.abstractfactory.country;

public class UK implements Country {
    @Override
    public String countryName() {
        return "UK";
    }

    @Override
    public String countryArea() {
        return "UK area : 1.99 M";
    }

    @Override
    public String countryCapital() {
        return "England";
    }

    @Override
    public String countryHeadName() {
        return "Elizbeth";
    }
}
