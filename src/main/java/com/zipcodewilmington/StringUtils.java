package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] words = sentence.split(" ");
        return words;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i) == ' ')
                return sentence.substring(0,i);
        }
        return null;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] words = sentence.split(" ");
        sentence = getFirstWord(sentence);

        return BasicStringUtils.reverse(sentence) + " " + words[1];

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] words = sentence.split(" ");
        //sentence = reverseFirstWord(sentence);
        String reversedWord = BasicStringUtils.reverse(words[0]);
        words[0] = reversedWord.substring(0,1).toUpperCase() + reversedWord.substring(1).toLowerCase();
        words[1] = words[1].substring(0,1).toUpperCase() + words[1].substring(1);
        return  words[0] + words[1];
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);
        return sb.toString();
    }

}
