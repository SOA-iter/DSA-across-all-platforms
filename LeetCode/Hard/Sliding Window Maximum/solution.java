import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) return new int[0];
        
        int n = arr.length;
        int[] result = new int[n - k + 1];
        int ri = 0; // Index pointer for our result array
        
        // Deque will store INDICES of array elements
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // 1. Remove indices that have slid out of the current window frame
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // 2. Remove indices of all elements smaller than the current element 
            // from the back of the deque (they will never be the maximum)
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            
            // 3. Add the current element's index to the back
            deque.offerLast(i);
            
            // 4. Once the window reaches size k, the front of the deque is our max
            if (i >= k - 1) {
                result[ri++] = arr[deque.peekFirst()];
            }
        }
        
        return result;
    }
}