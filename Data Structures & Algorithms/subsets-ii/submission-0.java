class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(nums);
        
        backTrack(nums,result,0,new ArrayList<>());
        return result;
    }

    private void backTrack(int[] nums,List<List<Integer>>result,int startIndex, List<Integer>temp){
        
        result.add(new ArrayList<>(temp));

        for(int i =startIndex;i<nums.length;i++){
            
            if(i>startIndex && nums[i] == nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backTrack(nums,result,i+1,temp);
            temp.remove(temp.size()-1);
            
        }
        return;
    }
}
