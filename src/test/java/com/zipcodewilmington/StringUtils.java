package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i == indexToCapitalize)
              sb.append(Character.toUpperCase(str.charAt(i)));
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        baseString = baseString.toLowerCase();
        for(int i=0;i< baseString.length();i++)
        {
            if(i == indexOfString && baseString.charAt(i) == characterToCheckFor)
                return true;
            if(i> indexOfString)
                break;
        }
        return false;
    }
}
