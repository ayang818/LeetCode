class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        a = [""]*30
        a[0] = '1'
        for i in range(1,30):
            flag = False
            str_lens = 1
            for j in range(len(a[i-1])):
                if flag:
                    str_lens += 1
                if j!=len(a[i-1])-1:
                    if a[i-1][j] == a[i-1][j+1]:
                        flag = True
                    else:
                        a[i]+=(str(str_lens)+a[i-1][j])
                        flag = False
                        str_lens = 1
                else:
                    a[i]+=(str(str_lens)+a[i-1][j])
        return a[n-1]
                
