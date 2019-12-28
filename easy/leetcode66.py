class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if not len(digits):
            digits.append(1)
            return digits
        else:
            ans = ""
            for i in digits:
                ans+=str(i)
            return list(str(int(ans)+1))
