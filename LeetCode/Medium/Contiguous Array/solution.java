class Solution {
    public int findMaxLength(int[] nums) {
        // HashMap to store the running sum and its first occurrence index
        // Key: running sum, Value: index where this sum first occurred
        Map<Integer, Integer> sumToIndexMap = new HashMap<>();
      
        // Initialize with sum 0 at index -1 (before array starts)
        // This handles the case when subarray starts from index 0
        sumToIndexMap.put(0, -1);
      
        int maxLength = 0;
        int runningSum = 0;
      
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Convert 0s to -1s and add to running sum
            // If nums[i] is 1, add 1; if nums[i] is 0, add -1
            runningSum += (nums[i] == 1) ? 1 : -1;
          
            // If we've seen this sum before, we found a balanced subarray
            if (sumToIndexMap.containsKey(runningSum)) {
                // Calculate the length of the subarray with equal 0s and 1s
                // The subarray is from index (sumToIndexMap.get(runningSum) + 1) to i
                int currentLength = i - sumToIndexMap.get(runningSum);
                maxLength = Math.max(maxLength, currentLength);
            } else {
                // First time seeing this sum, record its index
                sumToIndexMap.put(runningSum, i);
            }
        }
      
        return maxLength;
    }
}
