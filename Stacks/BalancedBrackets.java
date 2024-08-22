import java.util.*;
public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch=='{' || ch =='['){
                st.push(ch);
            }
            
            if(st.size() == 0) return false;

            if(ch == ')'){
                if(st.peek() == '(') st.pop();
                else return false;
            }
            if(ch == '}'){
                if(st.peek() == '{') st.pop();
                else return false;
            }
            if(ch ==']'){
                if(st.peek() == '[') st.pop();
                else return false;
            }
            }

        if(st.size() > 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }
}
