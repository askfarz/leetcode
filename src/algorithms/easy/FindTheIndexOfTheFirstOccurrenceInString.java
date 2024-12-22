package algorithms.easy;

public class FindTheIndexOfTheFirstOccurrenceInString {

    public static int strStr2(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        int nIndex = 0;

        for (int i = 0; i < h; i++) {
            if (haystack.charAt(i) == needle.charAt(nIndex)) {
                nIndex++;
            } else {
                i -= nIndex;
                nIndex = 0;
            }

            if (nIndex == n) {
                return i - n + 1;
            }
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        int firstIndex = -1;
        int needleLength = needle.length();
        int haystackLength = haystack.length();

        if (needleLength > haystackLength) {
            return firstIndex;
        }

        int i = 0;
        int j = 0;
        while (i < haystackLength && j < needleLength) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                j++;
                i++;
            } else {
                if (firstIndex != -1) {
                    i = firstIndex + 1;
                    firstIndex = -1;
                } else {
                    i++;
                }
                j = 0;
            }
        }

        if (j >= needleLength) {
            return firstIndex;
        } else {
            return -1;
        }
    }
}
