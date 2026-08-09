class Solution {
    public int median(int[][] matrix) {
        // code here
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Find the search space range [low, high]
        int low = matrix[0][0];
        int high = matrix[0][cols - 1];

        for (int i = 1; i < rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        int requiredCount = (rows * cols + 1) / 2;

        // Step 2: Binary search on value space
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            // Count numbers <= mid across all rows
            for (int i = 0; i < rows; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            if (count < requiredCount) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
        
    }
    private int countLessEqual(int[] row, int mid) {
        int low = 0, high = row.length;
        while (low < high) {
            int m = low + (high - low) / 2;
            if (row[m] <= mid) {
                low = m + 1;
            } else {
                high = m;
            }
        }
        return low;
    }
}