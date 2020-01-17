import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Main {
    public static int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int[] list = new int[10000];
        int[] valueList = new int[10000];
        int length = 0;
        while (head != null) {
            valueList[length] = head.val;
            while (!stack.isEmpty() && head.val > valueList[stack.peek()]) {
                list[stack.pop()] = head.val;
            }
            stack.add(length);
            length++;
            head = head.next;
        }
        int[] ansList = new int[length];
        for (int i = 0; i < length; i++) {
            ansList[i] = list[i];
        }
        return ansList;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        System.out.println(Arrays.toString(nextLargerNodes(node1)));
    }
}