import java.util.Comparator;
import java.util.PriorityQueue;


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> cmp = (node1, node2) -> node1.val - node2.val;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(cmp);
        ListNode head = new ListNode(0);
        ListNode res = head;
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            head.next = node;
            if (node.next!=null) {
                queue.offer(node.next);
            }
            head = head.next;
        }
        return res.next;
    }
}