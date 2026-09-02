class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;

        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        int totalTrappedWater = 0;

        while(l < r){
            if(height[l] < height[r]){

                if(height[l] >= leftMax){
                    leftMax = height[l];
                }else{
                    totalTrappedWater += leftMax - height[l];
                }
                l++;
            }else{

                if(height[r] >= rightMax){
                    rightMax = height[r];

                }else{
                     totalTrappedWater += rightMax - height[r];
                }


                r--;

            }
        }

        return totalTrappedWater;
        
        
    }
}
