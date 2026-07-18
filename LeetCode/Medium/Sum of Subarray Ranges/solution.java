import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long minsum = 0;
        long maxsum = 0;
        Stack<Integer> st = new Stack<>();

        // Contribution as minimum
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] > nums[i])) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                long count = (long) (mid - left) * (right - mid);
                minsum += (long) nums[mid] * count;
            }
            st.push(i);
        }

        st.clear();

        // Contribution as maximum
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] < nums[i])) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                long count = (long) (mid - left) * (right - mid);
                maxsum += (long) nums[mid] * count;
            }
            st.push(i);
        }

        return maxsum - minsum;
    }
}
