class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentStreak = 1;

                while (set.contains(num + currentStreak)) {
                    currentStreak ++;
                }
                maxLen = Math.max(currentStreak, maxLen);
            }
        }
        return maxLen;
    }
}
