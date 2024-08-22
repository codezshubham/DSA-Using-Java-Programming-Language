public class StringRotation {
    // Method to check if s2 is a rotation of s1
    public static boolean isRotation(String s1, String s2) {
        // Check if both strings have the same length and are not empty
        if (s1.length() == s2.length() && s1.length() > 0) {
            // Concatenate s1 with itself
            String s1s1 = s1 + s1;
            // Check if s2 is a substring of the concatenated string
            return s1s1.contains(s2);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean result = isRotation(s1, s2);
        System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\"? " + result);
    }
}
