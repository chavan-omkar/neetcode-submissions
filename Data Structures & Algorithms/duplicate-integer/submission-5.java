class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<>(nums.length);
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }else{
                return true;
            }
        }
        return false;
    }
}