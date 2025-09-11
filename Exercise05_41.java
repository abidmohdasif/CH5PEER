// Abid Asif
// September 11,2025
// This code takes in number and sipts out the largest number and its occurrence count

import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int number = input.nextInt();

        // Initialize with the first number
        int max = number;
        int count = 1;

        while (number != 0) {
            number = input.nextInt();

            if (number > max) {
                max = number;
                count = 1; 
            } else if (number == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
        input.close();
    }
}
