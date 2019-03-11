class Solution:
    def twoSum(self,nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n = len(nums)
        d = {}
        for x in range(n):
            a = target - nums[x]
           
            if nums[x] in d:
    
                return d[nums[x]],x
            else:
                d[a] = x



                            


            


