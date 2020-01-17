/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;
        if (head.next == null) {
            return null;
        }
        int count = 0;
        while (right != null) {
            if (count <= n) {
                right = right.next;
            } else {
                right = right.next;
                left = left.next;
            }
            count++;
        }
        left.next = left.next.next;
        return dummy.next;
    }
}