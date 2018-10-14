package edu.jacob.gof;

import edu.jacob.gof.abstractfactory.AbstractFactory;
import edu.jacob.gof.abstractfactory.CountryFactory;
import edu.jacob.gof.abstractfactory.FactoryProducer;
import edu.jacob.gof.abstractfactory.country.Country;
import edu.jacob.gof.abstractfactory.state.State;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GofApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void getCountry() {

        AbstractFactory af = FactoryProducer.getFactory("Country");

        Country c = af.getCountry("India");

        System.out.println(" -----  Country -------");
        System.out.println(c.countryName());
        System.out.println(c.countryArea());
        System.out.println(c.countryCapital());
        System.out.println(c.countryHeadName());
        System.out.println();

        Assert.assertEquals("India", c.countryName());

        c = af.getCountry("USA");
        System.out.println(c.countryName());
        System.out.println(c.countryArea());
        System.out.println(c.countryCapital());
        System.out.println(c.countryHeadName());
        System.out.println();

        Assert.assertEquals("America", c.countryName());

        c = af.getCountry("UK");
        System.out.println(c.countryName());
        System.out.println(c.countryArea());
        System.out.println(c.countryCapital());
        System.out.println(c.countryHeadName());
        System.out.println();
        Assert.assertEquals("UK", c.countryName());


        AbstractFactory state = FactoryProducer.getFactory("State");
        State s = state.getState("AP");

        System.out.println(" -----  State -------");
        System.out.println(s.stateName());
        System.out.println(s.getArea());
        System.out.println(s.stateHeadName());
        System.out.println(s.getCapital());
        System.out.println();

        s = state.getState("TS");

        System.out.println(s.stateName());
        System.out.println(s.getArea());
        System.out.println(s.stateHeadName());
        System.out.println(s.getCapital());
        System.out.println();


    }

}
