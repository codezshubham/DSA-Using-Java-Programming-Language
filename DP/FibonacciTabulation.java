public class FibonacciTabulation {
    public static void main(String[] args) {
        int n = 10;
        int prev1 = 1;
        int prev2 = 1;
        System.out.print("Fibonacci Series up to " + n + " numbers: ");
        System.out.print(prev1 + " " + prev2 + " ");
        for(int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            System.out.print(current + " ");
            prev1 = prev2;
            prev2 = current;
        }
    }
    
    }
// public class FibonacciTabulation {
//         public static int fib(int n, int[] dp){
//             if(n==1 || n==2) return 1;
//             if(dp[n]!=-1){
//                 return dp[n];
//             }
            
//             return dp[n] = fib(n-1, dp) + fib(n-2, dp);
//         }
//         public static void main(String[] args) {
//             int n = 10;
//             int[] dp = new int[n+1];
//             for(int i=0; i<=n; i++){
//                 dp[i] = -1;
//             }
//             dp[1] = 1;
//             dp[2] = 1;
//             for(int i=3; i<=n; i++){
//                 dp[i] = dp[i-1] + dp[i-2];
//             }
//             System.out.print(dp[n]);
//         }
//     }

