public class Prob2Sum {
    static int twoSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = 0;
                temp = arr[i] + arr[j];
                if(temp == target){
                    System.out.println("yes");
                    System.out.println("The Indexes are " + i + " " + "and " + j);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        twoSum(arr, target);
    }
}
