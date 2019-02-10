package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {

        List<Integer> list = new ArrayList<>();
        for(int n : ints)
        {
            if(n%2 != 0)
                list.add(n);
        }

        Integer[] odds = new Integer[list.size()];
        for(int i=0; i<list.size();i++)
            odds[i] = list.get(i);

        return odds;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        List<Integer> list = new ArrayList<>();
        for(int n : ints)
        {
            if(n%2 == 0)
                list.add(n);
        }

        Integer[] evens = new Integer[list.size()];
        for(int i=0; i<list.size();i++)
            evens[i] = list.get(i);

        return evens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {

        List<Integer> list = new ArrayList<>();
        for(int n : ints)
        {
            if(n%3 != 0)
                list.add(n);
        }

        Integer[] multiples = new Integer[list.size()];
        for(int i=0; i<list.size();i++)
            multiples[i] = list.get(i);

        return multiples;


    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        List<Integer> list = new ArrayList<>();
        for(int n : ints)
        {
            if(n%multiple != 0)
                list.add(n);
        }

        Integer[] multiples = new Integer[list.size()];
        for(int i=0; i<list.size();i++)
            multiples[i] = list.get(i);

        return multiples;

    }
}
