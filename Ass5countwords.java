package _concept.IOASSIGNMENT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class WordCountAndAverage { 
     public static void main(String[] args) {
        String filename = "data.txt";  

        try {
            FileReader f = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(f);
            int wordCount = 0;
            int totalWordLength = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
               String[] words = line.split(" ");  // Split by whitespace
                for (String word : words) {
                    if (!word.isEmpty()) {  // Check if the word is not empty
                        wordCount++;
                        totalWordLength += word.length();
                    }
                }
            }

            bufferedReader.close();

            if (wordCount > 0) {
                double averageWordLength = (double) totalWordLength / wordCount;
                System.out.println("Number of words in a file: " + wordCount);
                System.out.printf("Average word size in a file:"+ averageWordLength);
            } else {
                System.out.println("The file is empty or contains no words.");
            }
        } 
        catch (IOException e) {
           e.printStackTrace();
        }
    }
}

