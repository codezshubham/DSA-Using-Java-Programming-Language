public class AppearsOnes {
    public static int appear(int[] arr){
        for(int i=1; i<=4; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(count!=2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        System.out.println(appear(arr));
    }
}
