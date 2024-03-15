package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text) {
        // Remove whitespace from the input text
        text = text.replaceAll("\\s", "");

        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                if (i % 2 == 0) {
                    evenChars.append(ch);
                } else {
                    oddChars.append(ch);
                }
            }
        }

        return evenChars.toString() + oddChars.toString();
    }
}