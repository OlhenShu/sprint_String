package task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketValidatorTest {

    private final BracketValidator bracketValidator = new BracketValidator();

    @Test
    @DisplayName("Verify a single pair of round brackets is valid")
    public void checkOneRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("()"));
    }

    @Test
    @DisplayName("Verify a single pair of square brackets is valid")
    public void checkOneSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[]"));
    }

    @Test
    @DisplayName("Verify a single pair of curly brackets is valid")
    public void checkOneCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{}"));
    }

    @Test
    @DisplayName("Verify mismatched round and square brackets are invalid")
    public void checkInvalidSequentialRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("(]"));
    }

    @Test
    @DisplayName("Verify mismatched square and curly brackets are invalid")
    public void checkInvalidSequentialSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[}"));
    }

    @Test
    @DisplayName("Verify mismatched curly and round brackets are invalid")
    public void checkInvalidSequentialCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{)"));
    }

    @Test
    @DisplayName("Verify escaped round brackets affect validation")
    public void checkBackslashRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("(\\())"));
    }

    @Test
    @DisplayName("Verify escaped square brackets affect validation")
    public void checkBackslashSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[\\[]]"));
    }

    @Test
    @DisplayName("Verify escaped curly brackets affect validation")
    public void checkBackslashCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{\\{}}"));
    }

    @Test
    @DisplayName("Verify sequential pairs of round brackets are valid")
    public void checkSequentialRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("()()"));
    }

    @Test
    @DisplayName("Verify sequential pairs of square brackets are valid")
    public void checkSequentialSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[][]"));
    }

    @Test
    @DisplayName("Verify sequential pairs of curly brackets are valid")
    public void checkSequentialCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{}{}"));
    }

    @Test
    @DisplayName("Verify unclosed round brackets are invalid")
    public void checkOpenLastOverRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("(("));
    }

    @Test
    @DisplayName("Verify unclosed square brackets are invalid")
    public void checkOpenLastOverSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[["));
    }

    @Test
    @DisplayName("Verify unclosed curly brackets are invalid")
    public void checkOpenLastOverCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{{"));
    }

    @Test
    @DisplayName("Verify extra closing round brackets are invalid")
    public void checkCloseLastOverRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("))"));
    }

    @Test
    @DisplayName("Verify extra closing square brackets are invalid")
    public void checkCloseLastOverSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("]]"));
    }

    @Test
    @DisplayName("Verify extra closing curly brackets are invalid")
    public void checkCloseLastOverCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("}}"));
    }

    @Test
    @DisplayName("Verify cross-nested round and square brackets are invalid")
    public void checkCrossRoundSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("([)]"));
    }

    @Test
    @DisplayName("Verify cross-nested round and curly brackets are invalid")
    public void checkCrossRoundCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{(})"));
    }

    @Test
    @DisplayName("Verify cross-nested square and curly brackets are invalid")
    public void checkCrossSquareCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[{]}"));
    }

    @Test
    @DisplayName("Verify nested round brackets are valid")
    public void checkInnerRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("(())"));
    }

    @Test
    @DisplayName("Verify nested square brackets are valid")
    public void checkInnerSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[[]]"));
    }

    @Test
    @DisplayName("Verify nested curly brackets are valid")
    public void checkInnerCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{{}}"));
    }

    @Test
    @DisplayName("Verify complex nested round brackets are valid")
    public void checkInnerOverRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("(()())"));
    }

    @Test
    @DisplayName("Verify complex nested square brackets are valid")
    public void checkInnerOverSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[[[]]]"));
    }

    @Test
    @DisplayName("Verify complex nested curly brackets are valid")
    public void checkInnerOverCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{{{}}}"));
    }

    @Test
    @DisplayName("Verify properly nested mixed bracket types are valid")
    public void checkValidMixAll() {
        assertTrue(bracketValidator.verifyBrackets("{[()]}"));
    }

    @Test
    @DisplayName("Verify improperly nested mixed bracket types are invalid")
    public void checkInvalidMixAll() {
        assertFalse(bracketValidator.verifyBrackets("{[(])}"));
    }

    @Test
    @DisplayName("Verify empty text is considered valid")
    public void checkEmptyText() {
        assertTrue(bracketValidator.verifyBrackets(""));
    }

    @Test
    @DisplayName("Verify null input throws NullPointerException")
    public void checkNullString() {
        assertThrows(NullPointerException.class, () -> bracketValidator.verifyBrackets(null));
    }

    @Test
    @DisplayName("Verify text without brackets is valid")
    public void checkNoBrackets() {
        assertTrue(bracketValidator.verifyBrackets("This is a test without any brackets"));
    }

    @Test
    @DisplayName("Verify text with properly balanced brackets is valid")
    public void checkTextWithBrackets() {
        assertTrue(bracketValidator.verifyBrackets("This (is) a [test] with {brackets}"));
    }

    @Test
    @DisplayName("Verify performance with very long string of balanced brackets")
    public void checkVeryLongString() {
        String longString = new String(new char[100000]).replace("\0", "()");
        assertTrue(bracketValidator.verifyBrackets(longString));
    }
}
