class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        if(nums == null) return result;

        dfs(nums,0,new ArrayList<>(),result);
        return result;
    }

    private void dfs(int[] nums, int startIndx, List<Integer>temp, List<List<Integer>>result){
        result.add(new ArrayList<>(temp));

        for(int i = startIndx;i<nums.length;i++){
            temp.add(nums[i]);
            dfs(nums,i+1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}
