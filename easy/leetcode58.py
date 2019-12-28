class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        for i in s[::-1]:
            if i != " ":
                count+=1
            else:
                if count:
                    break
        return count
