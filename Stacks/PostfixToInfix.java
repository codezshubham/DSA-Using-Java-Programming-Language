import java.util.*;
public class PostfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if (ascii >= 48 && ascii <= 57) {
               String s = "" + ch;
               st.push(s);
            }
           else{
                String v2 = st.pop();
                String v1 = st.pop();
                char o = ch;

                String t = "(" + v1 + o + v2 + ")";
                st.push(t);
            }
    }
    System.out.println(st.peek());
}
}


