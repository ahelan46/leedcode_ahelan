// Last updated: 8/11/2026, 4:08:10 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int size(ListNode head) {
        int idx = 0;
        while (head != null) {
            head = head.next;
            idx++;
        }
        return idx;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;

        int size = size(head);

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode beforeLeft = dummy;
        ListNode left = head;

        for (int i = 0; i < size / k; i++) {
            ListNode prev = null;
            ListNode curr = left;
            ListNode next;

            for (int j = 0; j < k; j++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            beforeLeft.next = prev;
            left.next = curr;

            beforeLeft = left;
            left = curr;
        }

        return dummy.next;
    }
}