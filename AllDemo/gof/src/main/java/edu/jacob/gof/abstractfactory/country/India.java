package edu.jacob.gof.abstractfactory.country;

public class India implements Country {
    @Override
    public String countryName() {
        return "India";
    }

    @Override
    public String countryArea() {
        return "India Area : 3.511 MI";
    }

    @Override
    public String countryCapital() {
        return "New Delhi";
    }

    @Override
    public String countryHeadName() {
        return "Modi";
    }


}
