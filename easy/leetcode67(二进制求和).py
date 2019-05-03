class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        target = int(a, 2)+ int(b, 2)
        ans = ""
        while target//2:
            ans = str(target%2) + ans
            target = target//2
        ans = str(target) + ans
        return ans 
    
        
