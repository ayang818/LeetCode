
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode resNode = tempNode;
        int appendValue = 0;
        int nextAppendValue = 0;
        if (l1.next == null && l2.next == null) {
            if (l1.val + l2.val < 10) tempNode.next = new ListNode(l1.val + l2.val);
            else {
                tempNode.next = new ListNode((l1.val + l2.val) % 10);
                tempNode.next.next = new ListNode((l1.val + l2.val) / 10);
            }
        }
        while (l1 != null && l2 != null) {
            appendValue = l1.val + l2.val + nextAppendValue;
            nextAppendValue = appendValue / 10;
            appendValue = appendValue % 10;
            l1 = l1.next;
            l2 = l2.next;
            if (appendValue == 0 && nextAppendValue == 0 && l1 == null && l2 == null) break;
            if (l1 == null) l1 = new ListNode(0);
            if (l2 == null) l2 = new ListNode(0);
            tempNode.next = new ListNode(appendValue);
            tempNode = tempNode.next;
        }
        return resNode.next;
    }
}