class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k] ;
        HashMap<Integer,Integer> cnt = new HashMap<>();
        for(int num : nums){
            cnt.put(num,cnt.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> cnt.get(a)-cnt.get(b));

        for(int num : cnt.keySet()){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        for(int i = 0;i<k;i++){
            ans[i] = minHeap.poll();
        }

        return ans;
    }
}
