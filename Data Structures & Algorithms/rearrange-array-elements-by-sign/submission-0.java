class Solution {
    public int[] rearrangeArray(int[] nums) {
        if(nums == null || nums.length ==0){
            return new int[0];
        }
        int n = nums.length;
        int i = 0;
        int j = 1;
        int[] res = new int[n];
        for (int k = 0; k < n; k++) {
            if(nums[k] > 0){
                res[i] = nums[k];
                i+=2;

            }else{
                res[j] = nums[k];
                j+=2;
            }
        }
        return res;
    }
}