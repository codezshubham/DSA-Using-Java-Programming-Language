import java.util.*;
public class RecursiveReverse {
    public static void pushAtBottom(Stack<Integer> st, int x){
        // Stack<Integer> revt = new Stack<>();

        // while(st.size() > 0){
        //     revt.push(st.pop());
        // }
        // st.push(x);
        // while(revt.size() > 0){
        //     st.push(revt.pop());
        // }

        if(st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void reverseRec(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reverseRec(st);
        pushAtBottom(st, top);
    }
    
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseRec(st);
        System.out.println(st);
}
}

