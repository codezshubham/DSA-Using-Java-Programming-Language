public class pattern12 {
    public static void main(String[] args){
        pat12(5);
    }

    static void pat12(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int s=1; s<=2*(n-i); s++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
