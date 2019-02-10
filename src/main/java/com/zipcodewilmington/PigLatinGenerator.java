package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

       //str = str.toLowerCase();
       String result = "";

       String[] words = str.split(" ");
       for(String word : words){
           if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
           || word.startsWith("u") || word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O")
                   || word.startsWith("U"))
               word += "way";
           else
              word = movetheConsonents(word);
           result += word + " ";
       }
       return result.substring(0,result.length()-1);
    }

    private String  movetheConsonents(String word) {
       /* String[] consonents = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        for(String s : consonents) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.toString(word.charAt(i)).equals(s))
                    word = word.substring(1) + word.substring(0, 1);
            }
        }*//*

        for(int i=0;i<word.length();i++){
            *//*if(Character.toString(word.charAt(i)).equals("a") || Character.toString(word.charAt(i)).equals("e")
                    || Character.toString(word.charAt(i)).equals("i") || Character.toString(word.charAt(i)).equals("o")
                    || Character.toString(word.charAt(i)).equals("u") || Character.toString(word.charAt(i)).equals("A")
                    || Character.toString(word.charAt(i)).equals("E") || Character.toString(word.charAt(i)).equals("I")
                    || Character.toString(word.charAt(i)).equals("O") || Character.toString(word.charAt(i)).equals("U"))*//*
*/
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A' || word.charAt(i) == 'e' || word.charAt(i) == 'E'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'I' || word.charAt(i) == 'o' || word.charAt(i) == 'O'
                    || word.charAt(i) == 'u' || word.charAt(i) == 'U')
                break;
            else {
                word = word.substring(1) + word.substring(0,1);
            }
        }
        word += "ay";
        return word;
    }
}
