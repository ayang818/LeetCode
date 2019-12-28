class Solution(object):
    def prefixesDivBy5(self, A):
        """
        :type A: List[int]
        :rtype: List[bool]
        """
        answer = []
        res = ""
        for i in range(len(A)):
            res += str(A[i])
            if int(res,2)%5 == 0:
                answer.append(True)
            else:
                answer.append(False)
        return answer