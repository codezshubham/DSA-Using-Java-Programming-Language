import java.util.*;
public class Implementation{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        // while(st.size() > 1){
        //     st.pop();
        // }
        // System.out.println(st.peek());

        // System.out.println(isFull()); 
        System.out.println(st.search(5));
        System.out.println(st.search(6));
        System.out.println(st.search(8));
    }
}