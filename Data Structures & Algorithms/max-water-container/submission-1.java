class Solution {
    public int maxArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        int maxArea = 0;
        int left = 0;
        int right = heights.length-1;
        while(left < right){
            int width = right-left;

            int minHeight = Math.min(heights[left],heights[right]);

            maxArea = Math.max(maxArea,width*minHeight);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;

        
    }
}
