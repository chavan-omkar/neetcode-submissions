class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>(k);
        int n = arr.length;
        int ind = 0;
        int left = 0;
        int right = n-1;
        int min = 0;

        while(right - left+1 > k){

            int le = Math.abs(x-arr[left]);
            int ri = Math.abs(x-arr[right]);

            if( le > ri ){
                left++;
            }else if(le <= ri){
                right--;
            }
        } 

        for(int i = left;i<=right;i++){
            res.add(arr[i]);
        }
        return res;
    }
}