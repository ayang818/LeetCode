/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode start_0;
    ListNode start_1;
    ListNode start_2;
    ListNode reverseNode;
    ListNode if1;
    int count = 0;

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (count == 0) {
            start_0 = head;
        }
        if (head == null || m == n) {
            return head;
        }
        ListNode currentNode = head;
        ListNode nextNode = head.next;
        count++;
        if (count < m || count > n) {
            if (count == m - 1) {
                start_1 = currentNode;
            }
            head = head.next;
            reverseBetween(head, m, n);
        } else {
            if (count == m) {
                start_2 = currentNode;
            }
            if (count == n) {
                if (m == 1) {
                    // 这里需要往前指
                    head.next = reverseNode;
                    start_0.next = nextNode;
                    if1 = head;
                } else {
                    start_1.next = currentNode;
                    start_2.next = nextNode;
                }
            }
            head.next = reverseNode;
            reverseNode = currentNode;
            head = nextNode;
            reverseBetween(head, m, n);
        }
        if (m == 1) {
            return if1;
        }
        return start_0;
    }

    public void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }
}