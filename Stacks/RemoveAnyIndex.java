import java.util.*;
public class RemoveAnyIndex {
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index where you wanna delete element :");
        int n = sc.nextInt();
        Stack<Integer> revt = new Stack<>();

        while(st.size() > n){   // 1  2  3  4  5   Index
            revt.push(st.pop());// 1  2  3  4  5   value
        }
        st.pop();
        while(revt.size() > 0){
            st.push(revt.pop());
        }
        System.out.println(st);
}
}

