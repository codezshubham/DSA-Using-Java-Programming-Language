public class ReverseString {
    public static String reverseWithLoop(String s) {
        char[] chars = s.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseWithLoop(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

class ReverseString1 {
    public static String reverseWithStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseWithStringBuilder(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

class ReverseString2 {
    public static String reverseWithRecursion(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseWithRecursion(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseWithRecursion(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
