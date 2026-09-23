class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        int n = nums.length;

        while(fast < n){
            int num = nums[fast];

            if( num != 0 ){
                nums[fast] = nums[slow];
                nums[slow] = num;
                slow++;
            }
            fast++;
        }
        
    }
}