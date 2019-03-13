#第一种
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0 or (x % 10 == 0 and x != 0):
            return False
        y=0
        while(x>y):
            y= x % 10 + y * 10
            x /= 10
        return x==y or x==y/10
#第二种   
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        else:
            flag = 1
            x = str(x)
            for i in range(len(x)//2):
                if x[i] == x[-i-1]:
                    continue
                else:
                    flag = 0
                    break
            return bool(flag)

