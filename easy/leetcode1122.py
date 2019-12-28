class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :rtype: List[int]
        """
        arr3 = []
        arr4 = []
        for i in arr1:
            if (i not in arr2):
                arr3.append(i)
        for k in arr2:
            for j in arr1:
                if k == j:
                    arr4.append(k)
        arr3.sort()
        return arr4+arr3