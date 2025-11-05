import java.util.Random;
import java.util.Scanner;

public class ch12practice {
    public static void main(String[] args) {
        // Create an array of 100 randomly chosen integers
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000); // Random integers between 0 and 999
        }

        // Prompt the user to enter the index of the array
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an index (0-99): ");
            
            try {
                int index = scanner.nextInt();
                // Display the corresponding element value
                System.out.println("Element at index " + index + ": " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle out-of-bounds index
                System.out.println("Out of Bounds");
            } catch (Exception e) {
                // Handle invalid input
                System.out.println("Invalid input");
            }
        }
    }
}
