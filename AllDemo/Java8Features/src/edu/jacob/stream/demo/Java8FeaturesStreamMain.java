package edu.jacob.stream.demo;

import edu.jacob.streams.demo.service.Java8FeatureLogicalExampleService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8FeaturesStreamMain {



    public static void main(String[] args) {

        Java8FeatureLogicalExampleService service = new Java8FeatureLogicalExampleService();

        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        System.out.println(service.reverseNumber(numberList));


    }
}
