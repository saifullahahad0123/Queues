import java.util.Stack;
import java.util.LinkedList;

public class RearrangeQueue {

    static void rearrange(java.util.Queue<Integer> q) {

        Stack<Integer> st = new Stack<>();

        int n = q.size();

        // Put first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Move stack elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Move first half to the back
        for (int i = 0; i < n / 2; i++) {
            q.add(q.remove());
        }

        // Put first half into stack again
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Rearrange alternately
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        java.util.Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Before: " + q);

        rearrange(q);

        System.out.println("After:  " + q);
    }
}