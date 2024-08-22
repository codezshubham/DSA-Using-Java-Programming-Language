public class MaxConsOnes {
    public static int conse(int[] arr){
         int count = 0;
        int max1 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                max1 = Math.max(max1, count);
            }
            else{
                count = 0;
            }
        }
        return max1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1};

        System.out.println("Maximum Consecutive One's :");
       System.out.println(conse(arr));

    }
}
