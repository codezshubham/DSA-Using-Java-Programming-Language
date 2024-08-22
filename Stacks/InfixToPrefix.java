import java.util.*;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) { // 0 to 9
                String s = "" + ch;
                st.push(s);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    st.push(t);
                }
                op.pop(); // Pop this '('
            }

            else {
                if (ch == '+' || ch == '-') {
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    st.push(t);

                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        st.push(t);

                        op.push(ch);
                    }
                    // if ch=='-' || ch == '+'
                    else
                        op.push(ch);
                }
            }
        }
        while (st.size() > 1) {
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            st.push(t);

        }
        String res = st.pop();
        System.out.println(res);
    }
}
