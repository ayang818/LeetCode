#一道可以用递归也可以用dp的题，只要找出递推表达式题目就解决了递归问题和动态规划问题

#动态规划版本
class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        a = 1
        b = 2
        if n == 1:
            return 1
        if n == 2:
            return 2
        if n >2:
            for i in range(2, n):
                i = a+b
                a = b
                b = i
            return i
#递归做法
class Solution(object):
    def recursive(self, n):
        if n == 1:
            return 1
        if n == 2:
            return 2
        if n >2:
            return recursive(n-1) + revursive(n-1)
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        return recursive(n)
