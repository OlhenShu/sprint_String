package task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketValidatorTest {

    private final BracketValidator bracketValidator = new BracketValidator();

    @Test
    public void checkOneRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("()"));
    }

    @Test
    public void checkOneSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[]"));
    }

    @Test
    public void checkOneCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{}"));
    }

    @Test
    public void checkInvalidSequentialRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("(]"));
    }

    @Test
    public void checkInvalidSequentialSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[}"));
    }

    @Test
    public void checkInvalidSequentialCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{)"));
    }

    @Test
    public void checkBackslashRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("(\\())"));
    }

    @Test
    public void checkBackslashSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[\\[]]"));
    }

    @Test
    public void checkBackslashCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{\\{}}"));
    }

    @Test
    public void checkSequentialRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("()()"));
    }

    @Test
    public void checkSequentialSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[][]"));
    }

    @Test
    public void checkSequentialCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{}{}"));
    }

    @Test
    public void checkOpenLastOverRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("(("));
    }

    @Test
    public void checkOpenLastOverSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[["));
    }

    @Test
    public void checkOpenLastOverCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{{"));
    }

    @Test
    public void checkCloseLastOverRoundBrackets() {
        assertFalse(bracketValidator.verifyBrackets("))"));
    }

    @Test
    public void checkCloseLastOverSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("]]"));
    }

    @Test
    public void checkCloseLastOverCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("}}"));
    }

    @Test
    public void checkCrossRoundSquareBrackets() {
        assertFalse(bracketValidator.verifyBrackets("([)]"));
    }

    @Test
    public void checkCrossRoundCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("{(})"));
    }

    @Test
    public void checkCrossSquareCurlyBrackets() {
        assertFalse(bracketValidator.verifyBrackets("[{]}"));
    }

    @Test
    public void checkInnerRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("(())"));
    }

    @Test
    public void checkInnerSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[[]]"));
    }

    @Test
    public void checkInnerCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{{}}"));
    }

    @Test
    public void checkInnerOverRoundBrackets() {
        assertTrue(bracketValidator.verifyBrackets("(()())"));
    }

    @Test
    public void checkInnerOverSquareBrackets() {
        assertTrue(bracketValidator.verifyBrackets("[[[]]]"));
    }

    @Test
    public void checkInnerOverCurlyBrackets() {
        assertTrue(bracketValidator.verifyBrackets("{{{}}}"));
    }

    @Test
    public void checkValidMixAll() {
        assertTrue(bracketValidator.verifyBrackets("{[()]}"));
    }

    @Test
    public void checkInvalidMixAll() {
        assertFalse(bracketValidator.verifyBrackets("{[(])}"));
    }

    @Test
    public void checkEmptyText() {
        assertTrue(bracketValidator.verifyBrackets(""));
    }

    @Test
    public void checkNullString() {
        assertThrows(NullPointerException.class, () -> bracketValidator.verifyBrackets(null));
    }

    @Test
    public void checkNoBrackets() {
        assertTrue(bracketValidator.verifyBrackets("This is a test without any brackets"));
    }

    @Test
    public void checkTextWithBrackets() {
        assertTrue(bracketValidator.verifyBrackets("This (is) a [test] with {brackets}"));
    }

    @Test
    public void checkVeryLongString() {
        String longString = new String(new char[100000]).replace("\0", "()");
        assertTrue(bracketValidator.verifyBrackets(longString));
    }
}
