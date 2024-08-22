public class MaxSubarray {
    static void Subarr(int[] arr, int ans){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(sum == ans){
                    for(int x=i; x<=j; x++){
                        System.out.println(arr[x] + " ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = 7;
        Subarr(arr, ans);
    }
}
