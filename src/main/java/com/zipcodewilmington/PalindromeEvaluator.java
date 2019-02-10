package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] arr = StringEvaluator.getAllPrefixes(string);
        Set<String> list = new HashSet<>();

        for(String s : arr){
            if(isPalindrome(s))
                list.add(s);
        }
        return list.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        if(string.equals(reverseString(string)))
            return true;
        return false;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }
}
