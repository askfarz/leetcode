package algorithms.easy;

import algorithms.util.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeLinkedList {

    // T: O(n), M: O(n)
    public static boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        for (int i = 0, j = values.size() - 1; i < j; i++, j--) {
            if (!Objects.equals(values.get(i), values.get(j))) {
                return false;
            }
        }
        return true;
    }

    // T: O(n), M: O(1)
    public static boolean isPalindrome1(ListNode head) {
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            var next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        var tail = prev;
        while (tail != null) {
            if (tail.val != head.val) {
                return false;
            }
            tail = tail.next;
            head = head.next;
        }
        return true;
    }
}
