class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[n]=1;
        dp[n-1]=1;
        for(int i=n-2;i>=0;i--){
            dp[i]=dp[i+1]+dp[i+2];
        }
        return dp[0];
    }
    // private int helper(int start, int end,int[] dp){
    //     if(dp[start]!=-1){
    //         return dp[start];
    //     }
    //     dp[start]=helper(start+1,end,dp)+helper(start+2,end,dp);
    //     return dp[start];
    // }
}
