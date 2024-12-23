# Welcome to Practical Test Automation
### Sprint 2 String. Stringbuffer. Stringbuilder. Regex

### Task 2 BracketValidator Class
Implement a **BracketValidator class** that checks the correctness of nested brackets in a given text.</br>
The brackets can be round (), square [], or curly {}. </br>
Escaped brackets (sequences like \\(, \\), \\[, \\], \\{, and \\}) are not considered as brackets and should be ignored during the validation.</br>
The method **boolean verifyBrackets(String text)** should return _true_ if the brackets in the text are correctly nested and balanced, and _false_ otherwise.

#### Requirements
- The text may contain any characters, but only the brackets should be checked for correctness.
- Escaped brackets (e.g., \\(, \\)) should not affect the validation result.
- An empty string is considered valid.
- If the text is null, the method should throw a NullPointerException.
#### Examples
- "()" -> true
- "()[]{}" -> true
- "{(())}" -> true
- "(\\())" -> false
- "(]" -> false
- ")(" -> false
- "([)]" -> false
- "This is a test with \\(escaped brackets\\)" -> true
- "Text with [brackets] and \\[escaped brackets\\]" -> true
- "{More (complex) examples with [various \\(types\\) of] brackets}" -> true
