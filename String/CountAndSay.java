public class CountAndSay {

    // Method to generate the nth term in the "Count and Say" sequence
    public static String countAndSay(int n) {
        // Edge case: If n is less than or equal to 0, return an empty string
        if (n <= 0) {
            return "";
        }

        // Initialize the first term in the sequence
        String result = "1";
        
        // Generate the sequence up to the nth term
        for (int i = 1; i < n; i++) {
            // Update the result to the next term in the sequence
            result = getNextTerm(result);
        }

        // Return the nth term
        return result;
    }

    // Helper method to generate the next term in the sequence based on the current term
    private static String getNextTerm(String term) {
        // StringBuilder to build the next term efficiently
        StringBuilder nextTerm = new StringBuilder();
        // Initialize count of the current character sequence
        int count = 1;
        // Get the first character of the current term
        char currentChar = term.charAt(0);

        // Iterate through the rest of the current term starting from the second character
        for (int i = 1; i < term.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (term.charAt(i) == currentChar) {
                count++;
            } else {
                // If the current character is different, append the count and character to nextTerm
                nextTerm.append(count).append(currentChar);
                // Update the current character and reset the count
                currentChar = term.charAt(i);
                count = 1;
            }
        }

        // Append the last group of count and character to nextTerm
        nextTerm.append(count).append(currentChar);

        // Return the built next term as a string
        return nextTerm.toString();
    }

    // Main method to test the countAndSay function
    public static void main(String[] args) {
        // Define the term position to find in the sequence
        int n = 5;
        // Get the nth term in the "Count and Say" sequence
        String result = countAndSay(n);
        // Print the result
        System.out.println("The " + n + "th term in the 'Count and Say' sequence is: " + result);
    }
}
