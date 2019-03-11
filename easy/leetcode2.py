class Solution:
    def reverse(self, x: int) -> int:
        b = 0
        if x < 0:
            b, x = 1, abs(x)
        mod, res = 0, 0
        while x:
            #下面两行分离出每一个位，从而完成逆序
            x, mod = x // 10, x % 10
            res = res * 10 + mod
            if res > 2147483648:
                return 0
        if b == 1:
            res = -res
        return res
