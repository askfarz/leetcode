package algorithms.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String currentPrefix = "";
        String result = "";
        int count = 0;
        boolean finish = true;

        while (finish) {
            currentPrefix = result;

            if (strs[0].isEmpty()) {
                return currentPrefix;
            } else if (strs.length <= 1) {
                return strs[0];
            } else if (count < strs[0].length()) {
                result = result + strs[0].charAt(count++);
                for (String str : strs) {
                    if (!str.startsWith(result)) {
                        finish = false;
                        break;
                    }
                }
            } else {
                finish = false;
            }
        }
        return currentPrefix;
    }
}
