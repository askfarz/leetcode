package algorithms.easy;

import algorithms.util.ListNode;

public class MergeTwoSortedLists {

    /**
     * @param list1 singly-linked list {@link algorithms.util.ListNode}
     * @param list2 singly-linked list {@link algorithms.util.ListNode}
     * @return merged singly-linked list {@link algorithms.util.ListNode}
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode result = new ListNode();
        ListNode pointer = result;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }

        if (list1 != null) {
            pointer.next = list1;
        } else {
            pointer.next = list2;
        }
        return result.next;
    }
}
