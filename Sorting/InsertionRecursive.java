public class InsertionRecursive {
    static void insertion(int[] arr, int i){
        int n = arr.length;
            if(i >= n){
                return;
            }

            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

            insertion(arr, i+1);
        }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 2, 4, 5};
        insertion(arr, 1);
        for(int val : arr){
            System.out.println(val);
        }
    }
}
