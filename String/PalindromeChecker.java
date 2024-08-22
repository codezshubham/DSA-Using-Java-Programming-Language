public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {"racecar", "hello", "madam", "palindrome", "level"};

        for (String s : testStrings) {
            System.out.println("Is \"" + s + "\" a palindrome? " + isPalindrome(s));
        }
    }
}
