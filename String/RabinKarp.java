public class RabinKarp {

    // Prime number for hashing
    private static final int PRIME = 101;

    // Rabin-Karp Matching Algorithm
    public static boolean RKM(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();
        long patternHash = createHash(pattern, m);
        long textHash = createHash(text, m);

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash && checkEqual(pattern, text, i, m)) {
                return true;
            }

            if (i < n - m) {
                textHash = recalculateHash(text, textHash, i, m);
            }
        }

        return false;
    }

    // Create initial hash value for the given string of length m
    private static long createHash(String str, int m) {
        long hash = 0;
        for (int i = 0; i < m; i++) {
            hash += str.charAt(i) * power(PRIME, m - 1 - i);
        }
        return hash;
    }

    // Recalculate hash by removing the leftmost character and adding the next character
    private static long recalculateHash(String str, long oldHash, int oldIndex, int m) {
        long newHash = oldHash - str.charAt(oldIndex) * power(PRIME, m - 1);
        newHash = newHash * PRIME + str.charAt(oldIndex + m);
        return newHash;
    }

    // Check if the current substring matches the pattern
    private static boolean checkEqual(String pattern, String text, int start, int m) {
        for (int i = 0; i < m; i++) {
            if (pattern.charAt(i) != text.charAt(start + i)) {
                return false;
            }
        }
        return true;
    }

    // Calculate power of a number
    private static long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "this is a test text";
        String pattern = "test";

        boolean result = RKM(pattern, text);
        System.out.println("Pattern found: " + result);
    }
}
