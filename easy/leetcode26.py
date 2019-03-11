class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        lenth = len(nums)
        d = {}
        k = []
        # 这里找到了所有重复的下标,列成列表k
        for i in range(lenth):
            
            if nums[i] in d:
                k.append(i)
            else:
                d[nums[i]] = i
        Index = len(k)
        
        #这里去掉所有重复的项
        for i in range(Index):
            nums.pop(k[i])
            # k每个元素减一
            k = list(map(lambda i:i-1, k))
        ans = len(nums)
        return ans
