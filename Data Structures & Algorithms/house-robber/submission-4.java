class Solution {
   
    public int rob(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i =2;i<nums.length;i++){
            // dp[0] = nums[i] + dp[i+2];
            dp[i] = Math.max(dp[i-1], nums[i]+ dp[i-2]); 
        }
        return dp[nums.length-1];
        // return backTrack(nums,dp,0);
        
    }

    private int backTrack(int[] nums,int[] dp, int index){
        if(index >= nums.length){
            return 0;
        }
        
        if(dp[index] != -1){
            System.out.println("fetched from cache : " + dp[index]);
            return dp[index];
        }
        dp[index] = nums[index];
        int rob = nums[index] + backTrack(nums,dp,index+2);

        int skip = backTrack(nums,dp,index+1);
      dp[index] = Math.max(rob,skip);
        return dp[index];
       
    }

    
}
