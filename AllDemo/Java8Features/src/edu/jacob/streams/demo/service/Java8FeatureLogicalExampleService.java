package edu.jacob.streams.demo.service;

import javax.swing.*;
import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FeatureLogicalExampleService {


    public static<T> List<T> reverseNumber(List<T> number) {

        return number.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), lst -> {
                            Collections.reverse(lst);
                            return lst.stream();
                        }
                )).collect(Collectors.toCollection(ArrayList::new));


    }





}
