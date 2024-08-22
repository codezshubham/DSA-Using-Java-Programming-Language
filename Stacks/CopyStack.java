import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println(st);

        Stack<Integer> revt = new Stack<>();
        while(st.size() > 0){
            revt.push(st.pop());
        }
        
        System.out.println(revt);

        Stack<Integer> gt = new Stack<>();
        while(revt.size() > 0){
           gt.push(revt.pop());
        }

        System.out.println(gt);
        System.out.println(revt);
        System.out.println(st);
}
}
