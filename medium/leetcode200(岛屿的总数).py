class Solution(object):
    def __init__(self):
        self.ans = [i for i in range(100000)]

    def find(self, x):
        while self.ans[x] != x:
            x = self.ans[x]
        return x

    def merge(self, i, j):
        fi = self.find(i)
        fj = self.find(j)
        if self.ans[fi] != self.ans[fj]:
            self.ans[fi] = fj

    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                t1 = i*len(grid[0])+j
                t2 = t1+1
                t3 = t1+len(grid[0])
                if j+1<len(grid[0]) and grid[i][j] == "1" and grid[i][j+1] == "1":
                    self.merge(t1, t2)

                if i+1<len(grid) and grid[i][j] == "1" and grid[i+1][j] == "1":
                    self.merge(t1, t3)

                # print(self.ans[:(len(grid)*len(grid[0]))])

        answer = 0
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if self.ans[i*len(grid[0])+j] == i*len(grid[0])+j and grid[i][j] == "1":
                    answer += 1
        return answer
        
# s = Solution()
# ans = s.numIslands(
# [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]])
