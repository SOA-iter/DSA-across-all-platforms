class Solution {
    public int evalRPN(String[] tokens) {
        int a, b;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                st.add(st.pop() + st.pop());
            } else if (tokens[i].equals("/")) {
                a = st.pop(); // right
                b = st.pop(); // left
                st.add(b / a);
            } else if (tokens[i].equals("*")) {
                st.add(st.pop() * st.pop());
            } else if (tokens[i].equals("-")) {
                a = st.pop(); // right
                b = st.pop(); // left
                st.add(b - a);
            } else {
                st.add(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}
