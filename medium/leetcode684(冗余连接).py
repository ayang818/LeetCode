class Solution(object):
    def __init__(self):
        self.ans = [x for x in range(1005)]
    
    def find(self, x):
        while x!= self.ans[x]:
            x = self.ans[x]
        return x
    
    def merge(self, x, y):
        fx = self.find(x)
        fy = self.find(y)
        if fx != fy:
            if fx <= fy:
                self.ans[fy] = fx
            else:
                self.ans[fx] = fy
            # print(self.ans[:5])
    
    def findRedundantConnection(self, edges):
        """
        :type edges: List[List[int]]
        :rtype: List[int]
        """
        for i in range(len(edges)-1,-1,-1):
            for j in edges[:i]+edges[i+1:]:
                self.merge(j[0],j[1])
                # print(self.ans[:len(edges)])
            answer = 0
            for k in range(1,len(edges)+1):
                if self.ans[k] == k:
                    answer += 1
            if answer == 1:
                return edges[i]
            else:
                self.ans = [x for x in range(1005)]

# s = Solution()
# ans = s.findRedundantConnection([[1,2], [2,3], [3,4], [1,4], [1,5]])
# print(ans)
                
            
        
        
