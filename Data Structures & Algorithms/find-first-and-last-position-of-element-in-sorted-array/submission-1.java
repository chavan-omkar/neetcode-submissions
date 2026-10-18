class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstInd = boundary(nums,target);
        if(firstInd == nums.length || nums[firstInd] != target){
            return new int[]{-1,-1};
        }
        int secondInd = boundary(nums,target+1)-1;
        
    return new int[]{firstInd,secondInd};
    }

    private int boundary(int[] nums, int target){
        int left = 0;
        int right = nums.length;

        while(left < right){
            int mid = left + (right-left)/2;

            // if(nums[mid] == target) return mid;

            if(nums[mid] < target)left = mid+1;
            if(nums[mid]>= target) right = mid;
        }
        return left;
    }
}