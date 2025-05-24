package task4;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new NullPointerException("Input text cannot be null");
        }

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is a palindrome by comparing with its reverse
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
