public class pattern2 {
    public static void main(String[] args){
        pat2(5);
    }

    static void pat2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
