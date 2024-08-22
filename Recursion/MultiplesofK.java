public class MultiplesofK {
    static int multiple(int num, int k){
        if(k==0){
            return 0;
        }
        else{
            multiple(num, k-1);
            System.out.println(num * k);
        }
        return -1;
    }
    public static void main(String[] args) {
        multiple(12, 5);
    }
}
