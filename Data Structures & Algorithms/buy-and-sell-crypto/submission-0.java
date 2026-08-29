class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = l;
        int n = prices.length;
        int max = 0;

        while (l < n) {
            while (r < n) {
                max = Math.max(max, (prices[r] - prices[l]));
                r++;
            }
            l++;
            r = l+1;
        }

        return max;
    }
}
