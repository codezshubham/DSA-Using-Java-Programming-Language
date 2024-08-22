public class Sort0_1_2 {
    static void sort(int[] arr){
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                c1++;
            }
            else if(arr[i] == 1){
                c2++;
            }
            else{
                c3++;
            }
        }

        for(int i=0; i<c1; i++){
           arr[i] = 0;
        }
        for(int i=c1; i<c1+c2; i++){
            arr[i] = 1;
        }
        for(int i=c1+c2; i<arr.length; i++){
           arr[i] = 2;
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr);
    }
}
