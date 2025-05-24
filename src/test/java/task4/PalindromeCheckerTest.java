package task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    // Provide test data for positive tests (strings that are palindromes)
    private static Stream<String> palindromeStrings() {
        return Stream.of(
            "A man, a plan, a canal, Panama",
            "No lemon, no melon",
            "Madam, in Eden, I'm Adam.",
            "Was it a car or a cat I saw?",
            "Able was I ere I saw Elba",
            "A Toyota's a Toyota.",
            "1a2b2a1",
            "A Santa at NASA",
            "12321",
            "!@#$%^&*()",
            "Race car",
            "Taco cat",
            "UFO tofu",
            "Step on no pets",
            "Mr. Owl ate my metal worm"
        );
    }

    // Provide test data for negative tests (strings that are not palindromes)
    private static Stream<String> nonPalindromeStrings() {
        return Stream.of(
            "Hello, World!",
            "This is not a palindrome.",
            "1234567890",
            "Almostomola",
            "Random text",
            "Another example",
            "Palindrome"
        );
    }
    @Test
    @DisplayName("Null Input (should throw NullPointerException)")
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            PalindromeChecker.isPalindrome(null);
        }, "PalindromeChecker should throw NullPointerException for null input");
    }

    @Test
    @DisplayName("Single Character (always a palindrome)")
    void testSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    @ParameterizedTest
    @MethodSource("palindromeStrings")
    @DisplayName("Verify that strings are palindromes")
    void testPalindromeStrings(String input) {
        assertTrue(PalindromeChecker.isPalindrome(input),
                   "The string should be identified as a palindrome: " + input);
    }

    @ParameterizedTest
    @MethodSource("nonPalindromeStrings")
    @DisplayName("Verify that strings are not palindromes")
    void testNonPalindromeStrings(String input) {
        assertFalse(PalindromeChecker.isPalindrome(input),
                    "The string should not be identified as a palindrome: " + input);
    }

    @Test
    @DisplayName("Empty string (should be considered a palindrome)")
    void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""),
                  "An empty string should be considered a palindrome");
    }

    @Test
    @DisplayName("String with only spaces (should be considered a palindrome)")
    void testOnlySpaces() {
        assertTrue(PalindromeChecker.isPalindrome("   "),
                  "A string with only spaces should be considered a palindrome after cleaning");
    }

    @Test
    @DisplayName("Case insensitivity test")
    void testCaseInsensitivity() {
        assertTrue(PalindromeChecker.isPalindrome("Racecar"),
                  "The method should ignore case when checking for palindromes");
    }

    @Test
    @DisplayName("Very long palindrome (performance test)")
    void testVeryLongPalindrome() {
        // Create a palindrome with 10,000 characters
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sb.append('a');
        }
        String halfPalindrome = sb.toString();
        String palindrome = halfPalindrome + halfPalindrome;

        assertTrue(PalindromeChecker.isPalindrome(palindrome),
                  "The method should handle very long palindromes efficiently");
    }
}
