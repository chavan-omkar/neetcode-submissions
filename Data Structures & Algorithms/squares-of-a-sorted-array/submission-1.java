class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int n = nums.length;
        int l = 0;
        int r = n-1;
        
        int[] result = new int[n];
        int index = n-1;

        while(l <= r){

            if(nums[l] * nums[l] > nums[r] * nums[r]){
                result[index--] = nums[l] * nums[l];
                l++;
            }else{
                result[index--] = nums[r] * nums[r];
                r--;
            }

            
            



        }
return result;
        
    }
}