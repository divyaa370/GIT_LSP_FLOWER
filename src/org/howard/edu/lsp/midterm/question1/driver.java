package org.howard.edu.lsp.midterm.question1;

public class driver {
    public static void main(String[] args) {
        String text = "I love CSCI363";
        String encryptedText = SecurityOps.encrypt(text);
        System.out.println("Encrypted text: \"" + encryptedText + "\"");
    }
}
