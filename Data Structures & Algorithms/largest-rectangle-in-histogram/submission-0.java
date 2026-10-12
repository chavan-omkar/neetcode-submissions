class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer>stack = new ArrayDeque<>();
        int n = heights.length;

        for(int i =0;i<=n;i++){
            int curr = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > curr){
                int minHeight = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left-1;

                maxArea = Math.max(maxArea,width*minHeight); 
            }
            stack.push(i);
        }

        return maxArea;
        
    }
}
