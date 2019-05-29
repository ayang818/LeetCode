import javax.swing.text.html.parser.TagElement;

// 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。

// 返回被除数 dividend 除以除数 divisor 得到的商。

// 示例 1:

// 输入: dividend = 10, divisor = 3
// 输出: 3
// 示例 2:

// 输入: dividend = 7, divisor = -3
// 输出: -2
// 说明:

// 被除数和除数均为 32 位有符号整数。
// 除数不为 0。
// 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。

class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor<0) divisor = -divisor;
        if (dividend < 0 ) dividend=-dividend;
        int left = 0;
        int right = dividend;
        int mid=0;
        while(left<=right) {
            mid = (left + right) / 2;
            if (mid*divisor == dividend || (mid*divisor <= dividend && (mid+1)*divisor >= dividend) ) {
                return mid;
            }

            if (mid*divisor < dividend) {
                left = mid + 1;
            }
            if (mid*divisor > dividend) {
                right = mid - 1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        Solution s  = new Solution();
        int res;
        res = s.divide(10, 7);
        System.out.println(res);
    }
}