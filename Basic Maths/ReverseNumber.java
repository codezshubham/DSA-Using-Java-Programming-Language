public class ReverseNumber{
    static void reverseno(int num){
        int reverse = 0;
        int lastdigit = 0;

        while(num>0){
            lastdigit = num % 10;
            reverse = (reverse * 10) + lastdigit; 
            num = num / 10;
        }

        System.out.println("Reverse of number : " + reverse);
    }
    public static void main(String[] args) {
        reverseno(123456789);
    }
}
