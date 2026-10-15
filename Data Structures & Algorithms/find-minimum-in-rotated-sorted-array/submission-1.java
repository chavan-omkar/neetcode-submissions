class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int minNum = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[left] <= nums[mid]) {
                minNum = Math.min(minNum, nums[left]);
                left = mid + 1;

            } else {
                minNum = Math.min(minNum, nums[mid]);

                right = mid - 1;
            }
        }

        return minNum;
    }
}
