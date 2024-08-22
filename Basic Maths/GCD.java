public class GCD {
    static int gcd(int n1, int n2) {
      if (n2 == 0) {
        return n1;
      }
      return gcd(n2, n1 % n2);
    }
  
    // static void gcd(int n1, int n2){
    //     for(int i=Math.min(n1, n2); i>=1; i--){
    //         if((n1 % i) == 0 && (n2 % i) == 0){
    //             System.out.println(i);
    //             break;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int ans = gcd(20, 40);
        System.out.println(ans);
    }
}
