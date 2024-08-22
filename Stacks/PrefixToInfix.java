import java.util.*;
public class PrefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if (ascii >= 48 && ascii <= 57) {
               String s = "" + ch;
               st.push(s);
            }
           else{
                String v1 = st.pop();
                String v2 = st.pop();
                char o = ch;

                String t = "(" + v1 + o + v2 + ")";
                st.push(t);
            }
    }
    System.out.println(st.peek());
}
}




