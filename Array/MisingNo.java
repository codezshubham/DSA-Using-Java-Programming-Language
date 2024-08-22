public class MisingNo {
    public static int print(int[] arr, int n){
        for(int i=1; i<=n; i++){
            int flag = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        
        System.out.println("The Misiing Number Is :");
        System.out.println(print(arr, n));
    }
}
