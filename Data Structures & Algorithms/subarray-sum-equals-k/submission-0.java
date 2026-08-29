class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentSum = 0;
        int cnt = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            if (prefixSum.containsKey(currentSum - k)) {
                cnt += prefixSum.get(currentSum - k);
            }

            prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);
        }

        return cnt;
    }
}