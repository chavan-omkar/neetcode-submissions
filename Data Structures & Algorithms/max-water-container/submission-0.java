class Solution {
    public int maxArea(int[] heights) {

        int maxArea = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length-1;
        while(l<r){
            int dist = r -l;
            maxArea = Math.max(maxArea,(dist * (Math.min(heights[l],heights[r]))));

           if(heights[l] < heights[r]){
                l++;
                
            }
            else{
                r--;
               
            }
            
        }

        return maxArea;
        
    }
}
