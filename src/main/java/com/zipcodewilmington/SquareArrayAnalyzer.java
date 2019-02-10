package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        boolean check = false;

        List<Integer> givenInput = new ArrayList<>(Arrays.asList(input));
        List<Integer> sqares = new ArrayList<>(Arrays.asList(squaredValues));

        for(int num : givenInput){
            int square = (int) Math.pow(num, 2);
            for(int sq : squaredValues){
                if(square == sq)
                    check = true;
            }
            if(check == false)
                return false;
        }
        return true;
    }
}
