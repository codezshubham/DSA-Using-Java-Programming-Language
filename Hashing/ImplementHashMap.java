import java.util.*;
public class ImplementHashMap{
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        // Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        //Getting value of a key 
        System.out.println(mp.get("Yash"));  // 16
        System.out.println(mp.get("Rahul")); //null
        //Changing/Updating value of a key
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash")); // 25
        //Removing a pair from the Hashmap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("Riya")); // null
        //Checking if a key is in the hashmap
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Yash")); // true
        //Adding a new entry only if the new key doesn't exists alreday
        mp.putIfAbsent("Yashika", 30); //will enter
        mp.putIfAbsent("Yash", 30); //will not enter
        // get all keys in the haspmap
        System.out.println(mp.keySet());
        // get all values in the haspmap
        System.out.println(mp.values());
        // get all entries in the haspmap
        System.out.println(mp.entrySet());
        // Traversing all entries 
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }
}