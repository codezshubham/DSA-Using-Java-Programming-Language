public class FibonacciMemoization{
    public static int fib(int n, int[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        // int result = fib(n-1, dp) + fib(n-2, dp);
        // dp[n] = result;
        // return result;
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 100;
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        System.out.print(fib(n, dp));
    }
}