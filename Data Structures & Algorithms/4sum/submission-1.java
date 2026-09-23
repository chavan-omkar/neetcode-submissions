class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        if(target < 0 && nums[0] > 1){
                return result;
            }

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    

                    long sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                        
                    }
                    } else if (target > sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}