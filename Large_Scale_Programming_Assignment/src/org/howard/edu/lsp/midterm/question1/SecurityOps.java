package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text) {
        // Remove whitespace from the input text
        text = text.replaceAll("\\s", "");

        StringBuilder evenChars = new StringBuilder();  // StringBuilder to store even-indexed characters
        StringBuilder oddChars = new StringBuilder();  // StringBuilder to store odd-indexed characters

     // Iterate over each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // Get the current character
         
            if (Character.isLetterOrDigit(ch)) { // Checks if the character is a letter or digit
            	// Append the character to the appropriate StringBuilder based on its index
                if (i % 2 == 0) {
                    evenChars.append(ch); // Append to even-indexed characters StringBuilder
                } else {
                    oddChars.append(ch);  // Append to odd-indexed characters StringBuilder
                }
            }
        }
        // Concatenate the even and odd indexed characters to form the encrypted text
        return evenChars.toString() + oddChars.toString();
    }
}