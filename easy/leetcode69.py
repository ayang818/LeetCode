#一道变形的二分题，代码很简单,容易卡的地方应该是，出二分循环的条件可以有两个，需要考虑到平方根为整数和非整数的情况

class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        right_stu = 100000
        left_stu = 0
        # ans= [i for i in range(200)]
        while right_stu >= left_stu:
            mid = (right_stu + left_stu)//2
            # print(mid)
            if mid**2 > x:
                right_stu = mid -1
            if mid**2 < x:
                left_stu = mid + 1
            if (mid**2 < x and (mid+1)**2 > x) or mid**2 == x:
                return int(mid)
        
