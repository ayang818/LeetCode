class Solution {
    //开一个高精度
    private static final  double epsion = 10e-15;
    public boolean isPowerOfThree(int n) {
        // long ans = 1;
        // while(ans <= n)
        // {
        //     if (ans != n) ans*=3;
        //     else return true;
        // }
        // return false;
        //普通幂解法失败
        // if((double) (Math.log(n)/Math.log(3)) == (int) ((Math.log(n)/Math.log(3)))) return true;
        // else return false;
        double res = Math.log(n)/Math.log(3);
        //floor返回不大于的最大整数，ceil返回不小于的最大整数
        return Math.abs(res - Math.round(res)) < epsion;
    }
}
