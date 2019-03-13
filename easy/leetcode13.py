class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        hashmap = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        ans = 0
        for item in range(len(s)):
            #不到最后一位，有IV在末尾的情况存在
            if item < len(s) - 1 and hashmap[s[item]] < hashmap[s[item+1]]:
                ans = ans - hashmap[s[item]]
            else:
                ans = ans + hashmap[s[item]]
        return ans
