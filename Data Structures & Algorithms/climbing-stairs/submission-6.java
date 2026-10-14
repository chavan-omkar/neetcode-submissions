class Solution {
    public int climbStairs(int n) {

        if(n<=2) return n;

        int a = 1;
        int b = 2;
        // int ways = 0;
        for(int i = 3;i<=n;i++){
           int c = a+b;
            a = b;
            b = c;

        }

        return b;
        // int[] dp = new int[n+1];
        // dp[0] = 1;
        // dp[1] = 2;
        // for(int i =2;i<n;i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }

        // return dp[n-1];




        // if(n <=2){
        //     return n;
        // }

        // return climbStairs(n-1) + climbStairs(n-2);
        
    }
}
