import java.util.Stack;
import java.util.*;
public class InsertAnyIndex {
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index where you wanna insert element :");
        int n = sc.nextInt();
        Stack<Integer> revt = new Stack<>();

        while(st.size() >= n){
            revt.push(st.pop());
        }
        st.push(0);
        while(revt.size() > 0){
            st.push(revt.pop());
        }
        System.out.println(st);
}
}
