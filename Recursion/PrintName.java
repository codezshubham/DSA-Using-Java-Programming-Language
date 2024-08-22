public class PrintName {
    static void name(int n){
        if(n==5){
            return;
        }
        System.out.println("Shubham");
        name(n+1);
    }
    public static void main(String[] args) {
        name(1);
    }
}
