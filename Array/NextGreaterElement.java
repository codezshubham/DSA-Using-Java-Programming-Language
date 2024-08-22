import java.util.Arrays;

public class NextGreaterElement {
    public static void nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            res[i] = -1;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // for(int i=0; i<res.length; i++){
        //     System.out.print(res[i] + " ");
        // }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        nextGreater(arr);
    }
}
