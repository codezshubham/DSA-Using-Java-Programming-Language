public class pattern5 {
    public static void main(String[] args){
        pat5(5);
    }

    static void pat5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n+1-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
