class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor==0)
            return -1;
        if (dividend==0)
            return 0;
        if (divisor == 1)
            return dividend;
        if (dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;

        /** 符号位的处理参考了大佬的异或处理方法*/

        boolean negetive= (dividend ^ divisor)<0;
        // count计数现在除数是开始的几倍
        int res=0, count=1;
        long tempDividend = Math.abs((long)dividend);
        long tempDivisor = Math.abs((long)divisor);
        
        while (tempDividend >= tempDivisor) {
            // 题目不让使用乘除取模运算符
            tempDividend -= tempDivisor;
            res += count;

            if (tempDividend < Math.abs(divisor))
                break;
            
            if (tempDividend - tempDivisor < tempDivisor) {
                // System.out.println(count);
                // System.out.println(res);
                tempDivisor = Math.abs(divisor);
                count = 1;
                continue;
            }

            tempDivisor += tempDivisor;
            count += count;
        }
        return negetive ? 0-res: res;
    }
    public static void main(String[] args) {
        Solution s= new Solution();
        int ans = s.divide(37, 2);
        System.out.println(ans);
    }
}