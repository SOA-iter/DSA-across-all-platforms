class Solution {
    static int perfectSum(int[] arr, int target) {
        int n = arr.length;
        int mod = (int)1e9 + 7;
        int[][] mat = new int[n + 1][target + 1];

        // Base case: sum = 0 can always be formed (empty subset)
        for (int i = 0; i <= n; i++) {
            mat[i][0] = 1;
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    mat[i][j] = (mat[i - 1][j] + mat[i - 1][j - arr[i - 1]]) % mod;
                } else {
                    mat[i][j] = mat[i - 1][j];
                }
            }
        }

        return mat[n][target];
    }
}
