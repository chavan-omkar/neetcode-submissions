class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int remainining = target - nums[i];
            if (map.containsKey(remainining)) {
                // ans[0] = map.get(remainining);
                // ans[1] = i;
                return new int[] {map.get(remainining), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {0,0};
    }
}
