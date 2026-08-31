class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int n = nums.length;
        int[] ans = new int[nums.length * 2];

        for(int i =0;i<n;i++){
            ans[n+i] = ans[i] = nums[i];
             
        }

        return ans;
        
    }
}