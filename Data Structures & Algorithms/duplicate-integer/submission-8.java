class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<>(nums.length);
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}