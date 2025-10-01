// Abid Asif
// October 1,2025
// This code finds the location of the largest element in a 2D array.
import java.util.Scanner;

public class C8Peer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the number of rows and columns of the array: ex: 3 4 :");
        int rows = input.nextInt();
        int cols = input.nextInt();

        // Create and populate the array
        double[][] array = new double[rows][cols];
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        // checks at which cordinates is the number the largest
        int[] location = locateLargest(array);

        // Display the cordinates
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2]; 
        double max = a[0][0]; // the first number will be zero

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i + 1; // Adds one to get rid of the zero
                    location[1] = j + 1; // Adds one to get rid of the zero
                }
            }
        }

        return location;
    }
}