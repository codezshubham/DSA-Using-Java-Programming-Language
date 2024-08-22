

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, 8, 1, 0, -4};
        int min = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The Min Value In Array " + min);
    }
}
