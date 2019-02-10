package com.zipcodewilmington.assessment1.part5;

/**
 * Jagged array is an array of array (aka 2D array).
 * The arrays may not be the same length, hence the name jagged.
 * You can read more about it here https://en.wikipedia.org/wiki/Jagged_array.
 */
public class JaggedArrayUtils {

    /**
     * @param jaggedIntArray jagged array
     * @return the sum of all integers in all arrays in the input
     */
    public static Integer sum(Integer[][] jaggedIntArray) {

        int sum = 0;
        for(int i=0; i<jaggedIntArray.length; i++) {
            for(int j=0; j<jaggedIntArray[i].length; j++) {
                sum += jaggedIntArray[i][j];
            }
        }
        return sum;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return an array with the sums of each array in the input ordered in the same
     * order as the original i.e. the first array should have its sum in the first
     * slot of the outputted array
     */
    public static Integer[] rowsSum(Integer[][] jaggedIntArray) {
        int sum = 0;
        Integer[] sumArray = new Integer[jaggedIntArray.length];

        for(int i=0; i<jaggedIntArray.length; i++) {
            for(int j=0; j<jaggedIntArray[i].length; j++) {
                if(jaggedIntArray[i][j] != null)
                    sum += jaggedIntArray[i][j];
            }
            sumArray[i] = sum;
            sum = 0;
        }

        return sumArray;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the sum of the last item in each array in the input
     */
    public static Integer sumOfLastItems(Integer[][] jaggedIntArray) {

        int sum = 0;
        Integer[] sumArray = new Integer[jaggedIntArray.length];

        for(int i=0; i<jaggedIntArray.length; i++) {
            for(int j=0; j<jaggedIntArray[i].length; j++) {
                if(j == jaggedIntArray[i].length-1)
                    sum += jaggedIntArray[i][j];
            }

        }

        return sum;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the average of all integers in the input
     */
    public static Integer average(Integer[][] jaggedIntArray) {
        int sum = 0, n = 0;
        for(int i=0; i<jaggedIntArray.length; i++) {
            for(int j=0; j<jaggedIntArray[i].length; j++) {
                n += 1;
                sum += jaggedIntArray[i][j];
            }
        }

        return sum/n;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the maximum sum among the sums of each array in the input
     * e.g. {{1, 2, 3}, {1, 2}} would have sums 6 and 3. 6 would be the return
     */
    public static Integer getMaxSum(Integer[][] jaggedIntArray) {


        Integer[] sumArray = rowsSum(jaggedIntArray);
        int max = 0;
        for(int sum : sumArray) {
            if (sum > max)
                max = sum;
        }
        return max;
    }

    /**
     * @param jaggedIntArray jagged array
     * @return the number of integers in the input
     */
    public static Integer getTotalCells(Integer[][] jaggedIntArray) {

        int n =0;
        for(int i =0;i<jaggedIntArray.length;i++)
            for(int j=0;j<jaggedIntArray[i].length;j++)
                n += 1;

        Integer cells = new Integer(n);
        return cells;
    }
}


