class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> counts = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int diff = target - num;
            if(counts.containsKey(diff)){
                return new int[]{counts.get(diff),i};
            }

            counts.put(num,i);
        }

        return new int[]{};
}
}