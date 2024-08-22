public class CountDigits{
    static void count(int num){
        int count = 0;
        //int lastdigit = 0;

        while(num>0){
            //lastdigit = num % 10;
            count++;
            num = num / 10;
        }

        System.out.println("Total number of digits count : " + count);
    }
    public static void main(String[] args) {
        count(123456789);
    }
}