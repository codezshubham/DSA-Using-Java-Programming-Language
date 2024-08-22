

public class PositiveNegative {
    public static void main(String[] args) {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};

        System.out.println("The Positive Values are :-");
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){
                System.out.println(arr[i]);
            }
        }


        System.out.println("The Negative Values are :-");
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }

    }
}
