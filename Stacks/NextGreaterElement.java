import java.util.*;
public class NextGreaterElement {
    public static void nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for(int i=n-1; i>=0; i--){
            while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }

            if(st.size() == 0){
                 res[i] = -1;
                 st.push(arr[i]);
            }
            else{
                res[i] = st.peek();
                st.push(arr[i]);
            }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println();
            for(int i=0; i<res.length; i++){
                System.out.print(res[i] + " ");
             }
        }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        nextGreater(arr);
    }
}
