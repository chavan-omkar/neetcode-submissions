class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;

        int n = nums.length;

        while (fast < n) {
            int num = nums[fast];
            if (nums[fast] != nums[slow]) {
                slow++;

                nums[slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }
}