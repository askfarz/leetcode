package algorithms.easy;

import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        return removeLetter2(s).equals(removeLetter2(t));
    }

    private static String removeLetter2(String input) {
        StringBuilder str = new StringBuilder();
        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (c != '#') {
                str.append(c);
            } else if (!str.isEmpty()) {
                str.deleteCharAt(str.length() - 1);
            }
        }

        return str.toString();
    }

    private static String removeLetter1(String input) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack.toString();
    }
}
