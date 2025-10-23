import java.util.Scanner;

public class Practice {
    // Data fields
    private double x;       // x-coordinate of the center
    private double y;       // y-coordinate of the center
    private double radius;  // radius of the circle

    // Default constructor (center at (0,0), radius = 1)
    public Practice() {
        this.x = 0.0;
        this.y = 0.0;
        this.radius = 1.0;
    }

    // Parameterized constructor
    public Practice(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    // Calculate area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter (circumference)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Check if a point (px, py) is inside the circle
    public boolean isPointInside(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance <= radius;
    }

    // Check if this circle is inside another circle
    public boolean isInside(Practice other) {
        double distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        return distance + this.radius <= other.radius;
    }

    // Check if this circle overlaps another circle
    public boolean isOverlapping(Practice other) {
        double distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        return distance < (this.radius + other.radius);
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Default circle (the "donor" circle)
        Practice defaultCircle = new Practice();

        // Get user input for circle parameters
        System.out.print("Enter the x-coordinate of your circle center: ");
        double userX = input.nextDouble();

        System.out.print("Enter the y-coordinate of your circle center: ");
        double userY = input.nextDouble();

        System.out.print("Enter the radius of your circle: ");
        double userRadius = input.nextDouble();

        // Create user circle
        Practice userCircle = new Practice(userX, userY, userRadius);

        // Get test point coordinates
        System.out.print("Enter a test point x-coordinate: ");
        double pointX = input.nextDouble();

        System.out.print("Enter a test point y-coordinate: ");
        double pointY = input.nextDouble();

        // Display results
        System.out.println("\n=== Circle Information ===");
        System.out.println("User Circle Area: " + userCircle.getArea());
        System.out.println("User Circle Perimeter: " + userCircle.getPerimeter());
        System.out.println("Is point (" + pointX + ", " + pointY + ") inside user circle? " 
                            + userCircle.isPointInside(pointX, pointY));
        System.out.println("Is user circle inside default circle? " 
                            + userCircle.isInside(defaultCircle));
        System.out.println("Does user circle overlap default circle? " 
                            + userCircle.isOverlapping(defaultCircle));

        input.close();
    }
}
