/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode node;

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next != null) {
            ListNode tempNode = head.next;
            head.next = node;
            node = head;
            return reverseList(tempNode);
        }
        head.next = node;
        return head;
    }
}