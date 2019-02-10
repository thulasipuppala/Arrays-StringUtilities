package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllPrefixes(String string) {
        Set<String> list = new HashSet<>();
        int n = string.length();
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j <= n; j++) {
                list.add(string.substring(i, j));
            }
        }


        String[] arr = list.toArray(new String[0]);

        return arr;
    }

    public static String[] getCommonPrefixes(String string1, String string2) {
        //getCommonPrefix(String... strs)

        List<String> list1 = new ArrayList<>(Arrays.asList(getAllPrefixes(string1)));
        List<String> list2 = new ArrayList<>(Arrays.asList(getAllPrefixes(string2)));

        Set<String> result = new HashSet<>();

        for(String s : list1) {
            for (String s2 : list2) {
                if(s.equals(s2))
                    result.add(s2);
            }
        }

        return result.toArray(new String[0]);
    }

    public static String getLargestCommonPrefix(String string1, String string2) {
        List<String> list = new ArrayList<>(Arrays.asList(getCommonPrefixes(string1, string2)));

        int maxLength = 0;
        String largestString = "";
        for(String s : list){
            if(s.length() > maxLength){
                maxLength = s.length();
                largestString = s;
            }
        }

        return largestString;
    }
}
