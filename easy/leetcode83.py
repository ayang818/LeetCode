# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        get_node = head
        while get_node and get_node.next:
            if get_node.val == get_node.next.val:
                get_node.next = get_node.next.next
            else:
                get_node = get_node.next
        
        return head
