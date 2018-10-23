package edu.jacob.java8puzzle.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Java8PuzzleNumbersTest {

    private Puzzles pzl;
    @BeforeEach
    void setUp() {
        pzl = new Puzzles();
    }

    @Test
    public void testSquares() {


        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> listOfSquares = pzl.squaresOfGivenListOfIntegers(listOfNumbers);
        System.out.println("Squares Of Given List Of Integers");
        listOfSquares.forEach(System.out::println);

        assertEquals(listOfSquares, Arrays.asList(1, 4, 9, 16, 25));
    }

    @Test
    public void printListOfPrimeNumFromGivenListTest() {

        IntStream listOfPrimeNums = pzl.printListOfPrimeNumFromGivenList(30);

        assertArrayEquals(listOfPrimeNums.toArray(), IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29).toArray());

    }

    @Test
    public void isPrimeNumberTest() {

        boolean isPrimeNum = pzl.isPrimeNumber(3);
        assertEquals(isPrimeNum, true);

        assertEquals(pzl.isPrimeNumber(6), false);

        assertEquals(pzl.isPrimeNumber(97), true);

        assertEquals(pzl.isPrimeNumber(331), true);

        assertEquals(pzl.isPrimeNumber(91), false);

        assertEquals(pzl.isPrimeNumber(87), false);

        assertEquals(pzl.isPrimeNumber(2), true);
    }

    @Test
    public void floydTriangleTest() {

        pzl.floydTriangle(5);
    }

    @Test
    public void testPyramid() {

        int rows = 5;
        int backSlash = 1;
        System.out.println(rows);

        for (int j = 0, k=rows+rows; j< 10; j++) {

            for (int i = 0; i < rows; i++) {

                System.out.println(String.join("", Collections.nCopies(rows+(j*k) - i - 1, " "))
                        + String.join("", Collections.nCopies(i-i +1, "/"))
                        + ((i+1 == rows) ? String.join("", Collections.nCopies(2*i, "_")) : String.join("", Collections.nCopies(2*i, " ")))
                        //+ String.join("", Collections.nCopies(2*i, " "))
                        + String.join("", Collections.nCopies(backSlash, "\\"))

                );

            }
        }

    }
}