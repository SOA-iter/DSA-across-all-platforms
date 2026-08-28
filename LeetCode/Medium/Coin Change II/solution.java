class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] t = new int[n + 1][amount + 1];

        // Base case: There is 1 way to make amount 0 (using no coins)
        for (int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }

        // Base case: 0 ways to make amount > 0 with 0 coins
        for (int j = 1; j <= amount; j++) {
            t[0][j] = 0;
        }

        // Fill DP table: counting combinations (summing possibilities)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i - 1]) {
                    t[i][j] = t[i - 1][j] + t[i][j - coins[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][amount];
    }
}