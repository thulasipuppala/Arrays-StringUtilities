package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (Object s : objectArray) {
            if (s.equals(objectToCount))
                count++;
        }
        return count;
    }


    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        ArrayList<Object> list = new ArrayList<>();

        for(int i = 0; i < objectArray.length; i++)
        {
            if(objectArray[i] != objectToRemove)
                list.add(objectArray[i]);
        }
        return list.toArray();

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        HashMap<Object,Integer> map = new HashMap<>();
        for(Object o : objectArray)
            map.put(o, 1);

        Set<Object> set = map.keySet();
        for(Object o: objectArray){
            if(set.contains(o))
                map.put(o, map.get(o)+1);
        }
        int max = 0;
        Object maxObject = new Object();
        for(Object o: set){
            if(map.get(o) > max) {
                max = map.get(o);
                maxObject = o;
            }
        }

        return maxObject;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        HashMap<Object,Integer> map = new HashMap<>();
        for(Object o : objectArray)
            map.put(o, 1);

        Set<Object> set = map.keySet();
        for(Object o: objectArray){
            if(set.contains(o))
                map.put(o, map.get(o)+1);
        }
        int least = 10;
        Object maxObject = new Object();
        for(Object o: set){
            if(map.get(o) < least) {
                least = map.get(o);
                maxObject = o;
            }
        }

        return least;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        List<Object> list1 = new ArrayList<>(Arrays.asList(objectArray));
        List<Object> list2 = new ArrayList<>(Arrays.asList(objectArrayToAdd));

        list1.addAll(list2);

        return list1.toArray();
    }
}
