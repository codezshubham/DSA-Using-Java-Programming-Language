public class pattern13 {
    public static void main(String[] args){
        pat13(5);
    }

    static void pat13(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
