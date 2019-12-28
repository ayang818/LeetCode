class Solution(object):
    def isBoomerang(self, points):
        """
        :type points: List[List[int]]
        :rtype: bool
        """
        if points[0][1] == points[1][1] == points[2][1]:
            return False
        if points[0][0] == points[1][0] == points[2][0]:
            return False
        if points[0] == points[1] or points[0] == points[2] or points[1] == points[2]:
            return False
        try:
            dx = (points[1][1]-points[0][1])/(points[1][1]-points[0][1])
        except:
            dx = (points[2][1]-points[0][1])/(points[2][1]-points[0][1])
        db = points[1][1]-dx*points[1][1]
        if points[2][0]*dx + db == points[2][1] and points[1][0]*dx + db == points[1][1] and points[0][0]*dx + db == points[0][1]:
            return False
        else:
            return True
        
