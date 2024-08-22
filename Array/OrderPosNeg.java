

public class OrderPosNeg {
    public static void Order(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){
                System.out.print(arr[i] + " ");
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
    public static void main(String[] args) {

        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        Order(arr);

    }
}
