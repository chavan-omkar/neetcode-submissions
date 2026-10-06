class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int n = nums.length;
        int l = 0;
        int r = n-1;
        
        int[] result = new int[n];
        int index = 0;

        while(l <= r){

            if(Math.abs(nums[l]) > Math.abs(nums[r])){
              int squareLeft = nums[l] * nums[l];

              result[(n-1)-index] = squareLeft;
              l++;
            }else{
                int squareRight = nums[r] * nums[r];

                result[(n-1)-index] = squareRight;
                r--;
            }

            index++;
            



        }
return result;
        
    }
}