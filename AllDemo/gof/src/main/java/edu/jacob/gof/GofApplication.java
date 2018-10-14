package edu.jacob.gof;

import edu.jacob.gof.abstractfactory.AbstractFactory;
import edu.jacob.gof.abstractfactory.FactoryProducer;
import edu.jacob.gof.abstractfactory.country.Country;
import edu.jacob.gof.abstractfactory.state.State;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GofApplication {

    public static void main(String[] args) {
        SpringApplication.run(GofApplication.class, args);

        AbstractFactory af = FactoryProducer.getFactory("Country");

        Country c = af.getCountry("India");

        c.countryName();
        c.countryArea();
        c.countryCapital();
        c.countryHeadName();





    }
}
