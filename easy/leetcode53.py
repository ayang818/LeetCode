class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        lists = []
        lists.append(nums[0])
        for j in range(1,len(nums)):
            if lists[j-1] < 0:
                lists.append(nums[j])
            else:
                lists.append(lists[j-1] + nums[j])
        return max(lists)
