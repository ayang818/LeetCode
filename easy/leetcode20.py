class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        d = {")":"(","}":"{","]":"["}
        inneed = ["(","[","{"]
        list1 = []
        input_lens = len(s)
        if input_lens == 0:
            return True
        for i in range(input_lens):        
            if len(list1)==0 and s[i] not in inneed:
                return False
            if s[i] in inneed:
                list1.append(s[i])
            if s[i] not in inneed:
                if list1[-1] != d[s[i]]:
                    return False
                else:
                    list1.pop()
        if list1 == []:
            return True
        else:
            return False

            





