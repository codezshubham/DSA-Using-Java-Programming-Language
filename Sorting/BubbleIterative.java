public class BubbleIterative{
    static void bubble(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 3, 1};
        int n = arr.length;
        bubble(arr, n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}