# 执行用时 : 36 ms, 在Merge Two Sorted Lists的Python提交中击败了50.40% 的用户
# 内存消耗 : 11.8 MB, 在Merge Two Sorted Lists的Python提交中击败了0.57% 的用户
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        first = ListNode(0)
        head = first
        while l1 and l2:
            if l1.val >= l2.val:
                head.next = l2
                l2 = l2.next
            else:
                head.next = l1
                l1 = l1.next
            head = head.next
        if l1 is not None:
            head.next = l1
        if l2 is not None:
            head.next = l2
        return first.next
            
