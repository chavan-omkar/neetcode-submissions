class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        
        Arrays.fill(dp,amount+1);
        
        dp[0] = 0;

        for(int amounts = 1;amounts <= amount;amounts++){
            for(int coin : coins){

                if(coin <= amounts){
                    
                    dp[amounts] = Math.min(dp[amounts], dp[amounts-coin]+1);
                    
                }

            }
        }
        return dp[amount] > amount ? -1 :dp[amount];
    }
}
