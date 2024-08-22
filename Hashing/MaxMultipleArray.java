import java.util.*;
public class MaxMultipleArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 4, 2, 3, 4, 2, 3, 1, 2, 5, 2 ,2};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int el : arr){
            if(!mp.containsKey(el)){
                mp.put(el, 1);
            }
            else{
                mp.put(el, mp.get(el) + 1);
            }
        }
        System.out.println(mp.entrySet());
        int maxFreq = 0;
        int ansKey = -1;
        for(var e : mp.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue(); 
                ansKey = e.getKey();
            }
        }
        System.out.printf("%d element appears %d times", ansKey, maxFreq);
    }
}
