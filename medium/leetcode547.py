class Solution(object):
    def __init__(self):
        self.li = [i for i in range(205)]
    def findCircleNum(self, M):
        """
        :type M: List[List[int]]
        :rtype: int
        """
        for i in range(len(M)):
            for j in range(len(M)):
                if M[i][j] == 1 and i != j:
                    self.merge(i, j)
    
    def merge(self, i, j):
        fi = self.find(i)
        fj = self.find(j)
        if fi != fj:
            self.li[fi] = self.li[fj]

    def find(self, x):
        while self.li[x] != x:
            x = self.li[x]
        return x

