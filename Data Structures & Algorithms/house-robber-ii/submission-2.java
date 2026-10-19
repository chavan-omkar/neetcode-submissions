class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if(nums.length == 1) return nums[0];
        

        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1,-1);
        int max1 = backTrack(nums, dp1, 0, nums.length - 2);

         int[] dp2 = new int[nums.length];
        Arrays.fill(dp2,-1);
        int max2 = backTrack(nums, dp2, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    private int backTrack(int[] nums, int[] dp, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }

        if (dp[startIndex] != -1) {
            return dp[startIndex];
        }

        int robIt = nums[startIndex] + backTrack(nums, dp, startIndex + 2, endIndex);

        int skipIt = backTrack(nums, dp, startIndex + 1, endIndex);

        dp[startIndex] = Math.max(robIt, skipIt);

        return dp[startIndex];
    }
}
