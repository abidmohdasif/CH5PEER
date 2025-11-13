import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ch12text {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "poem.txt";
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File " + fileName + " does not exist.");
            return;
        }

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++; // Increment line count
                characterCount += line.length(); // Add the number of characters in the line
                String[] words = line.split("\\s+"); // Split the line into words
                wordCount += words.length; // Add the number of words in the line
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        // Print the results
        System.out.println("File " + file.getAbsolutePath() + " has");
        System.out.println(characterCount + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");
    }
}