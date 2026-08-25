class Solution {
    public boolean hasDuplicate(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;
       
        // Set<Integer> set = new HashSet<>();
        
        // for(int num : nums){
        //     if(!set.add(num)){
        //        return true;
        //     }
        // }
        // return false;
    }
}