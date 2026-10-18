class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates,target,0, new ArrayList<>(),result);
        return result;
        
    }

    private void backTrack(int[] nums, int target, int startIndex, List<Integer>temp,List<List<Integer>>result){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }

        if(target < 0) return;

        for(int i = startIndex;i<nums.length;i++){
            if(i>startIndex && nums[i] == nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backTrack(nums,target-nums[i],i+1,temp,result);
            temp.remove(temp.size()-1);
        }

        return;
    }
}
