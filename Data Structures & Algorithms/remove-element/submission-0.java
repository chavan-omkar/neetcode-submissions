class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int slow = 0;
        int fast = 0;
        int n = nums.length-1;

        while(fast<=n){
            int num = nums[fast];

            if(num != val){
                nums[slow] = nums[fast];
                nums[fast] = num;
                slow++;
            }
            fast++;

        }
        return slow;
        
    }
}