package com.zipcodewilmington.assessment1.part4;

/**
 * Floyd's triangle is a right-angled triangular array of natural numbers.
 * It is defined by filling the rows of the triangle with consecutive numbers,
 * starting with a 1 in the top left corner:
 *
 * 1
 * 2 	3
 * 4 	5 	6
 * 7 	8 	9 	10
 *
 * https://en.wikipedia.org/wiki/Floyd%27s_triangle
 */
public class FloydTriangle {
    /**
     * @param numOfRows number of rows that should be returned by the generator
     * @return a floyd triangle completed up the numOfRows rows
     */
    public static String generateTriangle(Integer numOfRows) {


        String str = "";
        int n = 0;
        for(int i=1;i<=numOfRows;i++){
            for(int j=1;j<=i;j++){
                n += 1;
                str += String.format("%d ", n);;
            }
            str+=String.format("\n");
        }
        return str;
    }

    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row) {

        String str = "";
        int n = 0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                n += 1;
                if(i == row)
                    str += String.format("%d ", n);;
            }

        }
        return str;
    }
}
