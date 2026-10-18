class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>result = new ArrayList<>();
        backTrack(nums,0, 0,target,result,new ArrayList<>());
        return result;
    }

    private void backTrack(int[] nums, int startIndx, int sum,int target, List<List<Integer>>result, List<Integer> temp){
        if(sum  == target){
            result.add(new ArrayList<>(temp));
            return;
        }

        if(sum > target) return;

        for(int i = startIndx;i<nums.length;i++){
            temp.add(nums[i]);
            backTrack(nums,i, sum + nums[i],target,result,temp);
            temp.remove(temp.size()-1);
           
        }
        return ;


    }
}
