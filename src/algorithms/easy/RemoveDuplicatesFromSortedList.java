package algorithms.easy;

import algorithms.util.ListNode;

public class RemoveDuplicatesFromSortedList {

    /**
     * @param head singly-linked list {@link algorithms.util.ListNode}
     * @return singly-linked list {@link algorithms.util.ListNode}
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode next = head.next;
        while (next != null) {
            if (prev.val == next.val) {
                prev.next = next.next;
            } else {
                prev = prev.next;
            }
            next = next.next;
        }
        return head;
    }
}
