// Abid Asif
// September 24, 2025
// This program simulates the locker problem
public class C7Peer {
    public static void main(String[] args) {
        // all the lockers are closed
        boolean[] lockers = new boolean[100];

        // Switching from open to clsoed
        for (int student = 1; student <= 100; student++) {
            for (int locker = student; locker <= 100; locker += student) {
                lockers[locker - 1] = !lockers[locker - 1];
            }
        }

        // Display the lockers that are open
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.println("Locker " + (i + 1) + " is open");
            }
        }
    }
}