package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        List<String> list = new ArrayList<String>();
        list = Arrays.asList(array);
        if (list.contains(value))
            return true;
        else
            return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String revArray[] = new String[9];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            revArray[j] = array[i];
        }

        return revArray;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String revArray[] = new String[9];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            revArray[j] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(revArray[i]))
                continue;
            else
                return false;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        boolean check = false;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (i = 0; i < array.length; i++) {
            sb.append(array[i]);
            String newString = sb.toString().toLowerCase();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (newString.indexOf(ch) == -1) {
                    check = false;
                } else
                    check = true;

            }
        }
        return check;
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String s : array) {
            if (s.equals(value))
                count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        List<String> list = new ArrayList<String>(Arrays.asList(array));
        // list = Arrays.asList(array);
        //for(String s : list)
        //{
        //  if(s.equals(valueToRemove))
        list.remove(valueToRemove);
        // }
        array = list.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {

            if (i + 1 < array.length && array[i].equals(array[i + 1])) {
                continue;
            } else
                list.add(array[i]);

        }

        String[] finArray = list.toArray(new String[0]);
        return finArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String>  list = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(array[i]);
            while (i + 1 < array.length && array[i].equals(array[i + 1])) {
                sb.append(array[i+1]);
                i++;
            }
            list.add(sb.toString());

        }

        String[] finArray = list.toArray(new String[0]);
        return finArray;




    }

}
