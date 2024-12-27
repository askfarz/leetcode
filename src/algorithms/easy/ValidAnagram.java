package algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else if (s.equalsIgnoreCase(t)) {
            return true;
        } else {
            char[] sortedS = stringToArray(s);
            char[] sortedT = stringToArray(t);
            return Arrays.equals(sortedS, sortedT);
        }
    }

    public static char[] stringToArray(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return charArray;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else if (s.equalsIgnoreCase(t)) {
            return true;
        } else {
            Map<String, Integer> dataS = new HashMap<>();
            String[] strS = s.trim().split("");
            for (String value : strS) {
                dataS.merge(value, 1, Integer::sum);
            }

            Map<String, Integer> dataT = new HashMap<>();
            String[] strT = t.trim().split("");
            for (String value : strT) {
                dataT.merge(value, 1, Integer::sum);
            }

            return dataS.equals(dataT);
        }
    }
}
