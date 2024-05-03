package org.howard.edu.lsp.assignment2;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        
        // current directory
    	String currentDirectory = System.getProperty("user.dir");

    	// get the package name
        String packageName = WordCount.class.getPackageName().replace('.', '/');    	
    	
        // words.txt file
        String fileName = "words.txt";
        
        // final path to the word.txt file
        String filePath = currentDirectory + "/src/" + packageName + "/" + fileName;
        System.out.println("The path which it expects the file to be: " + filePath);

        try {
            Map<String, Integer> wordFrequencyMap = countWordFrequency(filePath);

            // Print the contents of the word frequency map
            System.out.println("Word Frequencies:");
            for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Integer> countWordFrequency(String filePath) throws IOException {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove leading spaces and convert to lowercase
                line = line.trim().toLowerCase();

                // Split the line into words
                String[] words = line.split("\\s+");

                // Iterate over each word in the line
                for (String word : words) {
                    // Check if the word is alphabetical (does not contain numbers)
                    if (word.matches("[a-zA-Z]+")) {
                        // Check if the word is already in the map
                        if (wordFrequencyMap.containsKey(word)) {
                            // Increment the count of the word by 1
                            wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
                        } else {
                            // Add the word to the map with count 1
                            wordFrequencyMap.put(word, 1);
                        }
                    }
                }
            }
        }

        return wordFrequencyMap;
    }
}
