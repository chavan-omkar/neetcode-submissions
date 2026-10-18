class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int low = 1;

        for(int i : piles ){
            max = Math.max(max,i);
        }

        while (low < max) {
            int mid = low + (max - low) / 2;

            if (canEatAll(piles, mid, h)) {
                max = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canEatAll(int[] piles, int k, int h) {
        int sum = 0;
        for (int i : piles) {
            sum += (i-1) / k+1;
        }
        return sum <= h;
    }
}
