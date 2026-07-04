import java.util.Arrays;

class Solution {
    public int findMinDiff(int arr[], int m) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}