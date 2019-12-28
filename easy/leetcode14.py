class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        ans = ""
        strs_lens = len(strs)
        if strs_lens == 0:
            return ""
        if strs_lens == 1:
            return strs[0]
        else:
            for i in range(min(len(strs[0]),len(strs[1]))):
                if strs[0][i] == strs[1][i]:
                    ans += strs[0][i]
                else:
                    break
            #到这里就求出了前两位的公共字串
            for i in range(2, strs_lens):
                if len(strs[i]) == 0:
                    return ""
                lensx = min(len(ans),len(strs[i]))
                for j in range(lensx):
                    if strs[i][j] == ans[j]:
                        if lensx < len(ans):
                            ans = ans[:lensx]
                        continue
                    else:
                        ans = ans[:j]
                        break
        if ans == "":
            return ""
        else:
            return ans