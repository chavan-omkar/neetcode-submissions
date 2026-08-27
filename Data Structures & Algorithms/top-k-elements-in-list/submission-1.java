class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k] ;
        HashMap<Integer,Integer> cnt = new HashMap<>();
        for(int num : nums){
            cnt.put(num,cnt.getOrDefault(num,0)+1);
        }

        List<Integer>[]buckets = new List[nums.length+1];
        
        for(int num : cnt.keySet()){
            int freq = cnt.get(num);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        int index = 0;
        for(int i = buckets.length-1;i>=0;i--){
           if(buckets[i] != null){
            for(int num : buckets[i] ){
                ans[index++] = num;

                if(index == k){
                    return ans;
                }
            }
           }
        }

        return ans;
    }
}
