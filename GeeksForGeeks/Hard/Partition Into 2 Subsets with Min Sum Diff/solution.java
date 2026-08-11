class Solution {
    public int minDifference(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Initialize dynamic programming table
        boolean[][] t = new boolean[n + 1][sum + 1];

        // Base case: sum 0 is always achievable with 0 elements
        for (int i = 0; i <= n; i++) {
            t[i][0] = true;
        }

        // Filling up the table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        // All the subset sum which is possible for this n sized array will have true value in table in nth row
        for (int j = 0; j < sum + 1; j++) {
            if (t[n][j]) {
                ans = Math.min(ans, Math.abs(sum - 2 * j));
            }
        }

        return ans;
    }
}