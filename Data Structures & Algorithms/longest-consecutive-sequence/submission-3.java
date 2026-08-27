class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                // int currentNum = num;
                int currentStreak = 1;

                while (set.contains(num + currentStreak)) {
                    // currentNum += 1;
                    currentStreak ++;
                }
                maxLen = Math.max(currentStreak, maxLen);
            }
            // int j = nums[i];
            // int cnt = 1;
            // while(freq.containsKey(j+1)){
            //     cnt++;
            //     j++;
            // }
        }
        return maxLen;
    }
}
