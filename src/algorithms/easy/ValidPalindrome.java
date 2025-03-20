package algorithms.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidPalindrome {

    /*
    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
     */

    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        char[] charArr = s.toLowerCase().toCharArray();

        for (int i = 0, j = charArr.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(charArr[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(charArr[j])) {
                j--;
            } else if (charArr[i] == charArr[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        Deque<Character> reversedString = new ArrayDeque<>();
        char[] chars = s.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (Character.isLetterOrDigit(ch)) {
                reversedString.push(ch);
            }
        }

        for (char ch : chars) {
            if (Character.isLetterOrDigit(ch) && reversedString.pop() != ch) {
                return false;
            }
        }
        return true;
    }

    // String str1 = "abcd";
    // String str2 = "!!;d№;%;c...ba<><>";
    public static boolean isPalindrome(String str1, String str2) {
        Stack<Character> stack = new Stack<>();
        char[] charArr1 = str1.toLowerCase().toCharArray();
        char[] charArr2 = str2.toLowerCase().toCharArray();

        for (char c : charArr1) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }

        for (char c : charArr2) {
            if (Character.isAlphabetic(c) && (stack.isEmpty() || stack.pop() != c)) {
                return false;
            }
        }
        return true;
    }
}
