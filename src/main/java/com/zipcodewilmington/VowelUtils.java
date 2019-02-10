package rocks.zipcode.io.quiz3.fundamentals;

import org.apache.commons.lang3.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        word = word.toLowerCase();
        return StringUtils.containsAny(word, 'a','e','i','o','u');
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                return i;
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        word = word.toLowerCase();
        if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
            return true;
        return false;
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
            return true;
        return false;
    }
}
