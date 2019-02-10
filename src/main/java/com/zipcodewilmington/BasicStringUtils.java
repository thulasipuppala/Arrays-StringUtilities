package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {


        StringBuilder sb = new StringBuilder(str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase());
        for(int i=0;i<sb.length();i++)
        {
            if(i != 0 && sb.charAt(i-1) == ' ')
            {
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }
        str = sb.toString();
        return str;


    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--)
            sb.append(str.charAt(i));

        return sb.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {

        String[] s = str.split(" ");
        String reverseWord = "";

        for (int i = 0; i < s.length; i++)
        {
            String word = s[i];
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord += word.charAt(j);
            }

            if(i != s.length-1)
                reverseWord += ' ';
        }


        return reverseWord;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        str = reverse(str);
        str = camelCase(str);
        return str;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        str = str.substring(1,str.length()-1);
        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < str.length(); i++){
            if(str.charAt(i) == Character.toUpperCase(str.charAt(i)))
                sb.append(Character.toLowerCase(str.charAt(i)));
            else
                sb.append(Character.toUpperCase(str.charAt(i)));
        }
        return sb.toString();
    }

}
