class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        where = 0
        for i in range(len(nums)):
            if nums[i] != val:
                # print("s")
                nums[where] = nums[i]
                where+=1
            # print(nums)
        return where

s = Solution()
s.removeElement(nums=[3,2,2,3],val=3)
