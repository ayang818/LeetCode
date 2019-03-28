class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if target in nums:
            return nums.index(target)
        elif target<=nums[0]:
            return 0
        else:
            for i in range(len(nums)-1):
                if nums[i]<=target<=nums[i+1]:
                    return nums.index(nums[i]) + 1
            return len(nums)
