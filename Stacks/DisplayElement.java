
import java.util.*;

public class DisplayElement {
    // public static void display(Stack<Integer> st){
    //     Stack<Integer> rt = new Stack<>();
    //     while(st.size() > 0){
    //         rt.push(st.pop());
    //     }

    //     while(rt.size() > 0){
    //         // st.push(rt.pop());
    //         // System.out.println(st.peek());
    //         int x = rt.pop();
    //         System.out.print(x + " ");
    //         st.push(x);
    //     }
    // }

    // public static void display(Stack<Integer> st){
    //     int n = st.size();
    //     int[] arr = new int[n];
    //     for(int i=n-1; i>=0; i--){
    //         arr[i] = st.pop();
    //     }

    //     for(int i=0; i<n; i++){
    //         System.out.println(arr[i]);
    //         st.push(arr[i]);
    //     }
    // }

    public static void display(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        display(st);
        System.out.println(top + " ");
        st.push(top);
    }
    
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);
}
}
