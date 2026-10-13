class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    
        List<int[]>res = new ArrayList<>();

        for(int[] arr : intervals){
            if(newInterval == null || arr[1] < newInterval[0]){
                res.add(arr);
            }else if(arr[0] > newInterval[1]){
                res.add(newInterval);
                res.add(arr);
                newInterval = null;
            }else{
                newInterval[0] = Math.min(arr[0],newInterval[0]);
                newInterval[1] = Math.max(arr[1],newInterval[1]);
            }
        }

        if(newInterval != null) res.add(newInterval);

        return res.toArray(new int[res.size()][]);
    }
}
