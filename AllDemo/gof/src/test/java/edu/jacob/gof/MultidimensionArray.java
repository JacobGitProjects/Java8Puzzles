package edu.jacob.gof;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultidimensionArray {

    private List<Character> charList;
    private Character[][] charArray2D;
    private static Character[][] emptyCharArray2D;

    char p1 = 'X';
    char p2 = 'Y';

    @Before
    public void setup() {
        charList = Arrays.asList('a', '1', 'b', '2', 'c', '3', 'd','4', 'e', '5', 'f');

        charArray2D = new Character[][]{{'1', '2', '3'}, {'4' ,'5', '6'}, {'7', '8', '9'}};

        emptyCharArray2D = new Character[3][3];
    }

    @Test
    public void dimensionArray () {

        System.out.println(charArray2D.length);
        for (int i =0; i<charArray2D.length; i++) {

            System.out.print("+ - - - - - +");
            System.out.print(System.lineSeparator()+"|");
            for (int j=0; j< charArray2D.length; j++) {
                System.out.print(" "+charArray2D[i][j]+" |");

            }
            System.out.println();
        }
        System.out.print("+ - - - - - +");

        System.out.println();
        System.out.println();

        placeSymbol(0,0, p1);
        placeSelectedNoIn2DArray();
        placeSymbol(0,1, p2);
        placeSelectedNoIn2DArray();
        placeSymbol(0,2, p1);
        placeSymbol(1,0, p2);
        placeSymbol(1,1, p1);
        placeSymbol(1,2, p2);
        placeSymbol(2,0, p2);
        placeSymbol(2,1, p2);
        placeSymbol(2,2, p1);

        placeSelectedNoIn2DArray();
        calculate(p1);

    }




    public void placeSelectedNoIn2DArray() {

        for (int i =0; i<emptyCharArray2D.length; i++) {

            System.out.print("+ - - - - - +");
            System.out.print(System.lineSeparator()+"|");
            for (int j=0; j< emptyCharArray2D.length; j++) {

                if (emptyCharArray2D[i][j] != null) {
                    System.out.print(" "+emptyCharArray2D[i][j]+" |");
                } else {
                    System.out.print("   |");
                }


            }
            System.out.println();
        }
        System.out.print("+ - - - - - +");

        System.out.println();
        System.out.println();

    }


    private Character[][] placeSymbol (int p, int q, char symbol) {

        emptyCharArray2D[p][q] = symbol;

        return emptyCharArray2D;
    }

    /**
     *
     * XXX OXO OOX
     *
     *
     * @param p
     */
    private void calculate(char p) {

        String list = Arrays.deepToString(emptyCharArray2D);

        System.out.println(list.intern());
        System.out.println(Arrays.toString(emptyCharArray2D));

        int k = 1;
        for (int i =0; i< emptyCharArray2D.length; i++) {

            for (int j = 0; j < emptyCharArray2D.length; j++) {

                if (i == j && emptyCharArray2D[i][j] == p) {
                    k = k+1;
                    if (k == 3) {
                        System.out.println(" Player"+p+" won the game!!");
                    } else
                    continue;
                } else break;

            }
            k = 0;
        }

        if (emptyCharArray2D[0][0] == p && emptyCharArray2D[0][1] == p && emptyCharArray2D[0][2] == p) {

        }

    }

}
