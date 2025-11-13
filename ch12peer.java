/*
 * Abid Asif
 * 11/13/2025
 * The code read the text from the URL and calculates the total and average of the scores.
 */
 
 import java.io.FileNotFoundException;
 import java.io.IOException;
 import java.io.InputStream;
 import java.net.MalformedURLException;
 import java.net.URL;
 import java.util.Scanner;

 public class ch12peer {
     public static void main(String[] args) throws FileNotFoundException, MalformedURLException, IOException {
         // Create a URL object for the file
         URL url = new URL("https://liveexample.pearsoncmg.com/data/Scores.txt");
  
         // Open an input stream from the URL
         InputStream input = url.openStream();
  
          // Use Scanner to read the data
         Scanner scanner = new Scanner(input);
  
         double total = 0;
         int count = 0;
  
         // Read scores until end of file
         while (scanner.hasNext()) {
             if (scanner.hasNextDouble()) {
                 total += scanner.nextDouble();
                 count++;
             } else {
                 scanner.next(); // skip non-number data
             }
         }
  
         // Display total and average
         System.out.println("Total is " + total);
         if (count > 0) {
             System.out.println("Average is " + (total / count));
         } else {
             System.out.println("No scores found.");
         }
  
         // Close scanner
         scanner.close();
  
     }
 }