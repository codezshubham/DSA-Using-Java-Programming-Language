import java.util.Stack;
public class ReverseStack {
    public static void reverse(Stack<Integer> st){
        Stack<Integer> revt = new Stack<>();
        while(st.size() > 0){
            revt.push(st.pop());
        }
        
        Stack<Integer> gt = new Stack<>();
        while(revt.size() > 0){
           gt.push(revt.pop());
        }

        while(gt.size() > 0){
            st.push(gt.pop());
        }

         System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        reverse(st);
}
}


