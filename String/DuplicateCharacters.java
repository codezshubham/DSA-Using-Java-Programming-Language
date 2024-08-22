import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void findDuplicates(String s) {
        // HashMap to store characters and their counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through the map to identify duplicates
        System.out.println("Duplicate characters in \"" + s + "\":");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String testString = "programming";
        findDuplicates(testString);
    }
}
