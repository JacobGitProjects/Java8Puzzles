package edu.jacob.java8puzzle.numbers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Puzzles {


    public List<Integer> squaresOfGivenListOfIntegers(List<Integer> listOfNumbers) {

        return listOfNumbers
                .stream()
                .map(e -> e *e)
                .collect(Collectors.toList());
    }

    public IntStream printListOfPrimeNumFromGivenList(int i) {

      return IntStream.rangeClosed(2, i)
                .filter( j -> IntStream.rangeClosed(2, (int) Math.sqrt(j))
                    .allMatch(k -> j%k !=0 ))
                ;


    }

    public boolean isPrimeNumber(int i) {

        return printListOfPrimeNumFromGivenList(i).anyMatch(e -> e == i);
    }

    public void floydTriangle(int i) {

        int l = 1;
        IntStream.range(0, 6)
                .forEach(e ->

                                    System.out.println(String.join("", Collections.nCopies(e, String.valueOf(e)+"-"))
                                            + String.join("", Collections.nCopies(e, String.valueOf(e+1)))

                                ));
        /*for(int j=0; j< i; j++) {

            for (int k = 0; k < j; k++) {
                System.out.println(String.join("", Collections.nCopies(j+1, String.valueOf(k))));
            }

        }*/
    }
}
