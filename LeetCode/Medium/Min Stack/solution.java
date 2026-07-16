import java.util.Stack;

class MinStack {

    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } else if (val >= min) {
            st.push((long) val);
        } else {
            // Store encoded value
            st.push(2L * val - min);
            min = val;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long top = st.pop();

        if (top < min) {
            // Decode previous minimum
            min = 2 * min - top;
        }
    }

    public int top() {
        long top = st.peek();

        if (top < min)
            return (int) min;

        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}