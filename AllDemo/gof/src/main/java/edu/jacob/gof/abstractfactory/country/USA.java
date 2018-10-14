package edu.jacob.gof.abstractfactory.country;

public class USA implements Country{

    @Override
    public String countryName() {
        return "America";
    }

    @Override
    public String countryArea() {
        return "America Area : 4.511 MI";
    }

    @Override
    public String countryCapital() {
        return "Washington D.C";
    }

    @Override
    public String countryHeadName() {
        return "Trump";
    }
}
