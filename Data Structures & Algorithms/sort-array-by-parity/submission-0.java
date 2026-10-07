class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int slow = 0;
        int fast = 0;

        int n = nums.length;
        while(fast < n){
           int temp = nums[fast];
            if(nums[fast]%2==0){
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
        return nums;
        
    }
}