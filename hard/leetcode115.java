public class Solution {
    public int numDistinct(String S, String T) {
        if(S==null||T==null)    return 0;
        //dp[i][j]表示S的前i个字符包含T的前j个字符 可以取得的个数
        int[][] dp=new int[S.length()+1][T.length()+1];  
        for(int i=0;i<=S.length();i++) dp[i][0]=1;
        for(int i=1;i<=S.length();i++){
            for (int j=1;j<=T.length();j++){    
                if(S.charAt(i-1)!=T.charAt(j-1)){
                    dp[i][j]=dp[i-1][j];
                } else{
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                }
            }
        }
        return dp[S.length()][T.length()];
    }
}