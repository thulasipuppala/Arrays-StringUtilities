package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ArrayUtility {


    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        array1 = new Integer[array1.length + array2.length];
        int index = 0;
        for(int n : list) {
            array1[index] = n;
            index++;
        }
        return array1;
    }

    public Integer[] rotate(Integer[] array, int num) {
        int size = array.length;
       for(int i = 0;i<num;i++){
           int j,temp;
           temp = array[0];
           for (j = 0; j < size - 1; j++)
               array[j] = array[j + 1];
           array[j] = temp;
       }

        return array;
    }

    public Integer countOccurrance(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        int count = 0;
        for(int num : list)
            if(num == valueToEvaluate)
                count++;
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        if(array.length == 1)
            return array[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : array)
        {
            if(!map.containsKey(num))
                map.put(num, 0);
            else
                map.put(num, map.get(num) + 1);
        }

        int max = 0;
        int maxNumber = 0;
        for(int num : map.keySet())
            if(map.get(num) > max) {
                max = map.get(num);
                maxNumber = num;
            }
        return maxNumber;
    }
}
