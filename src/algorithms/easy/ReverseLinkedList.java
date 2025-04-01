package algorithms.easy;

import algorithms.util.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String[] args) {
        reverseList(new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(7)))))); // result [7,6,4,2,1]
    }

    /**
     * @param head singly-linked list {@link algorithms.util.ListNode}
     * @return reversed singly-linked list {@link algorithms.util.ListNode}
     */
    public static ListNode reverseListIterate(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * @param head singly-linked list {@link algorithms.util.ListNode}
     * @return reversed singly-linked list {@link algorithms.util.ListNode}
     */
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode reversedHead = new ListNode();
        ListNode pointer = reversedHead;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = null;
            pointer.next = node;
            pointer = pointer.next;
        }
        return reversedHead.next;
    }
}
