# Welcome to Advanced Test Automation (Java) with Selenium
### Sprint 2: String, StringBuffer, StringBuilder, and Regex

### Task 3: TextFormatter Class
Implement a **reformatLines** method of the TextFormatter class, which performs the following actions:

- Replace all sequences of spaces with a single space.
- Reformat the text so that the length of each line does not exceed 60 characters.

#### Requirements
- The input text may contain any characters, but only spaces should be replaced and line lengths adjusted.
- An empty string is considered valid and should remain empty in the output.
- If the input text is null, the method should throw a NullPointerException.

#### Examples
Below is an example of text reformatting:

- **Input text:**
  ```
  Java    was      originally developed
  by    James   Gosling at Sun Microsystems (which
  has since been
  acquired by Oracle) and released in 1995
  as a core component of Sun Microsystems' Java platform.
  ```
- **Expected output text:**
  ```
  Java was originally developed by James Gosling at Sun
  Microsystems (which has since been acquired by Oracle) and
  released in 1995 as a core component of Sun Microsystems'
  Java platform.
  ```
