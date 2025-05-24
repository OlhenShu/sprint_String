# Welcome to Advanced Test Automation (Java) with Selenium
### Sprint 2: String, StringBuffer, StringBuilder, and Regex

### Task 2: BracketValidator Class
Implement a **BracketValidator** class that checks the correctness of nested brackets in a given text.</br>
The brackets can be round (), square [], or curly {}.</br>
Escaped brackets (sequences like \\(, \\), \\[, \\], \\{, and \\}) are not considered as brackets and should be ignored during the validation.</br>
The method **boolean verifyBrackets(String text)** should return _true_ if the brackets in the text are correctly nested and balanced, and _false_ otherwise.

#### Requirements
- The text may contain any characters, but only the brackets should be checked for correctness.
- Escaped brackets (e.g., \\(, \\)) should not affect the validation result as they should be ignored.
- An empty string is considered valid.
- If the text is null, the method should throw a NullPointerException.
#### Examples
The following examples illustrate valid and invalid bracket patterns:

**Valid Bracket Patterns:**
- `()` -> true (simple matching pair)
- `()[]{}` -> true (multiple matching pairs)
- `{(())}` -> true (nested brackets)
- `This is a test with \\(escaped brackets\\)` -> true (escaped brackets are ignored)
- `Text with [brackets] and \\[escaped brackets\\]` -> true (mix of regular and escaped brackets)
- `{More (complex) examples with [various \\(types\\) of] brackets}` -> true (complex nesting)

**Invalid Bracket Patterns:**
- `(\\())` -> false (unbalanced brackets after ignoring escaped brackets)
- `(]` -> false (mismatched bracket types)
- `)(` -> false (closing bracket before opening bracket)
- `([)]` -> false (improperly nested brackets)
