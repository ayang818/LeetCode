/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int anathorAdd = 0;
        int res = 0;
        ListNode node = new ListNode(0);
        ListNode tmp = node;
        while (l1 != null || l2 != null) {
            int num = 0;
            if (l1 != null) {
                num+=l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num+=l2.val;
                l2 = l2.next;
            }
            num+=anathorAdd;
            anathorAdd = num/10;
            num %= 10;
            tmp.next = new ListNode(num);
            tmp = tmp.next;
        }
        if (anathorAdd == 1) {
            tmp.next = new ListNode(1);
        }
        return node.next;
    }
}