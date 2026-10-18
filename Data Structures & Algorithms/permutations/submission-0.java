class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(nums, visited,new ArrayList<>(), result);
        return result;
    }

    private void backTrack(
        int[] nums, boolean[] visited, List<Integer> temp, List<List<Integer>> result ) {
        if (temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            temp.add(nums[i]);
            backTrack(nums,visited,temp,result);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}
