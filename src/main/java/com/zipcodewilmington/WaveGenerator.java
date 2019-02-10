package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        String[] wave = new String[0];
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        int row = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == ' ' || str.charAt(i) == '_') {
                continue;
            }
            for(int j=0;j<str.length();j++){
                if(pos == j)
                    sb.append(Character.toUpperCase(str.charAt(j)));
                else
                    sb.append(str.charAt(j));
            }
            wave = Arrays.copyOf(wave, wave.length+1);
            wave[row] = sb.toString();
            sb = new StringBuilder();
            pos++;
            row++;
        }
        return wave;
    }
}
