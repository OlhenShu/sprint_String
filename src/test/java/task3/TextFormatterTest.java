package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextFormatterTest {

    private final TextFormatter textFormatter = new TextFormatter();

    @Test
    @DisplayName("Test with a single letter")
    public void checkOneLetter() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with a single word")
    public void checkOneWord() {
        String input = "Hello";
        String expected = "Hello";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with a single line of text less than 60 characters")
    public void checkOneLine() {
        String input = "Hello World";
        String expected = "Hello World";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with a single line of exactly 60 characters")
    public void checkOneLineMaxSymbols() {
        String input = "A".repeat(60);
        String expected = "A".repeat(60);
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with a single word of exactly 60 characters")
    public void checkOneWordMaxSymbols() {
        String input = "A".repeat(60);
        String expected = "A".repeat(60);
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with text that should be split into two lines")
    public void checkTwoLine() {
        String input = "Hello world this is a test that should be split into two lines";
        String expected = "Hello world this is a test that should be split into two\nlines";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with text consisting of two words each of exactly 60 characters")
    public void checkTwoWordMaxSymbols() {
        String input = "A".repeat(60) + " " + "B".repeat(60);
        String expected = "A".repeat(60) + "\n" + "B".repeat(60);
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with text that should be split into multiple lines")
    public void checkManyLines() {
        String input = "This is a longer text that should be split into multiple lines because it exceeds the maximum line length of sixty characters.";
        String expected = "This is a longer text that should be split into multiple\nlines because it exceeds the maximum line length of sixty\ncharacters.";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with input text containing multiple lines")
    public void checkInputManyLines() {
        String input = "This is a test\nwith multiple lines\nin the input text.";
        String expected = "This is a test with multiple lines in the input text.";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with output text containing multiple lines")
    public void checkOutputManyLines() {
        String input = "This is a longer text that should be split into multiple lines because it exceeds the maximum line length of sixty characters.";

        String expected = "This is a longer text that should be split into multiple\nlines because it exceeds the maximum line length of sixty\ncharacters.";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with input text containing empty lines")
    public void checkInputEmptyLines() {
        String input = "This is a test with\n\nempty lines in the input text.";
        String expected = "This is a test with empty lines in the input text.";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with leading spaces in the input text")
    public void checkStartSpaces() {
        String input = "   Leading spaces should be removed.";
        String expected = "Leading spaces should be removed.";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with trailing spaces in the input text")
    public void checkEndSpaces() {
        String input = "Trailing spaces should be removed.   ";
        String expected = "Trailing spaces should be removed.";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with multiple spaces within the text")
    public void checkInnerSpaces() {
        String input = "Multiple    spaces   should  be    replaced by a single space.";
        String expected = "Multiple spaces should be replaced by a single space.";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with an empty input text")
    public void checkEmptyText() {
        String input = "";
        String expected = "";
        assertEquals(expected, textFormatter.reformatLines(input));
    }

    @Test
    @DisplayName("Test with null input text")
    public void checkNullString() {
        assertThrows(NullPointerException.class, () -> textFormatter.reformatLines(null));
    }
}
