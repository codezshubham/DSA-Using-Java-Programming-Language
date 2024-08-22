import java.util.*;

public class ReorderQueue {
    public static void reorder(Queue<Integer> q) {
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        while (q.size() > n / 2) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        while (q.size() > n / 2) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
            q.add(q.remove());
        }

        // Reverse Queue
        while (q.size() > 0) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        System.out.print(q);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        reorder(q);
    }
}
