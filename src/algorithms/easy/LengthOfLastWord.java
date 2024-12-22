package algorithms.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord2(String s) {
        s = s.trim();
        char space = ' ';

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == space) {
                break;
            }
            length++;
        }
        return length;
    }

    public int lengthOfLastWord1(String s) {
        String[] words = s.trim().split("\\s");
        return words[words.length - 1].length();
    }
}
