package algorithms.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {

    private static final Map<Character, Character> ALLOWED_PARENTHESES = Map.of('(', ')', '[', ']', '{', '}');

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        if (s == null || s.length() <= 1) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && ((Character) s.charAt(i)).equals(ALLOWED_PARENTHESES.get(stack.peek()))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
