import math
class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if len(haystack) == 0 and len(needle) == 0:
            return 0
        if len(haystack) == 0 and len(needle) != 0:
            return -1
        if len(needle) == 0 and len(haystack):
            return 0
        if len(haystack) < len(needle):
            return -1
        maxlen = max(len(haystack),len(needle))
        minlen = min(len(haystack),len(needle))
        for i in range(maxlen):
            if haystack[i] == needle[0] and maxlen - i >= minlen:
                for j in range(minlen):
                    if haystack[i+j] == needle[j]:
                        if minlen-1 == j:
                            return i
                        continue
                    else:
                        break
        return -1

s = Solution()
k = s.strStr("mississippi","issip")
print(k)
