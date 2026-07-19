class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // Find the first smaller element to the left
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
        st.clear();
        
        // FIX: Iterate from right to left to find the first smaller element to the right
        for(int i = n - 1; i >= 0; i--){
            // FIX: Condition must look for smaller elements (>=), just like the left loop
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        int maxarea = 0;
        for(int i = 0; i < n; i++){
            int width = right[i] - left[i] - 1;
            maxarea = Math.max(maxarea, heights[i] * width);
        }
        return maxarea;
    }
}