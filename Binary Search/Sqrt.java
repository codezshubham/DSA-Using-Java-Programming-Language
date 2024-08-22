public class Sqrt {
    static int sqrt(int num){
        int low = 1;
        int high = num;
        int ans = 1;
        while(low<=high){
            int mid = (low + high) / 2;

            if((mid * mid) <= num){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 24;
        int temp = sqrt(n);
        System.out.println(temp);
    }
}
