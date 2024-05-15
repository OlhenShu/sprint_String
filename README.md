# Welcome to Practical Test Automation
### Sprint 2 String. Stringbuffer. Stringbuilder. Regex

### Task 4 BracketValidator Class

Write a method that determines whether a given string is a palindrome. A palindrome is a string that reads the same forward and backward. For the purpose of this check, you should ignore spaces, punctuation marks, and capitalization.

Requirements
The input will be a string that may contain alphabetic characters, numbers, spaces, and punctuation.
The output should be a boolean indicating whether the string is a palindrome.
Spaces, punctuation, and capitalization should not affect the palindrome check.
Function Signature
java
Копіювати код
public static boolean isPalindrome(String text): boolean
Examples
Example 1:

Input: "A man, a plan, a canal, Panama"
Output: true
Explanation: After removing punctuation and spaces, and converting to lowercase, the string "amanaplanacanalpanama" reads the same forwards and backwards.
Example 2:

Input: "No lemon, no melon"
Output: true
Explanation: Ignoring spaces and punctuation, and converting to lowercase, "nolemonnomelon" is a palindrome.
Example 3:

Input: "Hello, World!"
Output: false
Explanation: This string does not form a palindrome when punctuation and spaces are ignored and when case is normalized.
Implementation Details
The method should:

Normalize the input by converting all characters to lowercase.
Remove all non-alphanumeric characters (i.e., spaces and punctuation).
Check if the cleaned string is a palindrome by comparing it to its reverse.
This function will help determine if textual data respects the palindrome property, disregarding common formatting and casing differences.
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