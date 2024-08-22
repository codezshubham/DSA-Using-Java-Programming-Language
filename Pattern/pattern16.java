public class pattern16 {
    public static void main(String[] args){
        pat16(4);
    }

    static void pat16(int n){
        int OriginalN = n;
        n = 2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                int top = i;
                int left = j;
                int right = n - j;
                int down = n - i;
                int atEveryIndex = OriginalN - Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
