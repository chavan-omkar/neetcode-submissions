class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        // int left=0;
        // int fast = 0;
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (i >= k) {
                sum -= arr[i - k];
            }
            if (i >= k - 1) {
                int avg = sum / k;

                if (avg >= threshold) {
                    count++;
                }
            }
        }

        return count;
    }
}