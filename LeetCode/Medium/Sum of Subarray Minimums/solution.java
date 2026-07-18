import java.util.Stack;

public class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;
        
        // Arrays to store the distance to the previous/next smaller element
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        // 1. Find Distance to Previous Smaller Element (Left boundaries)
        for (int i = 0; i < n; i++) {
            // Strict less than (>=) to handle duplicates on one side
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            // Distance is current index minus the index of the smaller element
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        
        // Clear the stack to reuse it for the right boundaries
        stack.clear();
        
        // 2. Find Distance to Next Smaller Element (Right boundaries)
        for (int i = n - 1; i >= 0; i--) {
            // Greater than (>) to avoid double-counting duplicate numbers
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            // Distance is the index of the smaller element minus current index
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }
        
        // 3. Calculate the total sum using long to prevent overflow
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            long count = (long) left[i] * right[i];
            long contribution = count * arr[i];
            totalSum = (totalSum + contribution) % MOD;
        }
        
        return (int) totalSum;
    }
}