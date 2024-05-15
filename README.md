# Welcome to Practical Test Automation
### Sprint 2 String. Stringbuffer. Stringbuilder. Regex

### Task 3 BracketValidator Class
Implement a reformatLines method of the **TextFormatter class**, which performs the following actions:

- Replace all sequences of spaces with a single space.
- Reformat the text so that the length of each line does not exceed 60 characters.

#### Requirements
- The input text may contain any characters, but only spaces should be replaced and line lengths adjusted.
- An empty string is considered valid and should remain empty in the output.
- If the input text is null, the method should throw a NullPointerException.

#### Examples
- **Input text:**</br>
  Java    was      originally developed</br>
  by    James   Gosling at Sun Microsystems (which</br>
  has since been</br>
  acquired by Oracle) and released in 1995</br>
  as a core component of Sun Microsystems' Java platform.</br>
- **Expected output text:**</br>
  Java was originally developed by James Gosling at Sun</br>
  Microsystems (which has since been acquired by Oracle) and</br>
  released in 1995 as a core component of Sun Microsystems'</br>
  Java platform.