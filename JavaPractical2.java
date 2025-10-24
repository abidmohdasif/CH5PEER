/*
 * Abid Asif
 * 10/24/2025
 * CSC 121
 * Asks the User for input to create a circle and give information such as the area and perimeter of the circle and compares it to a default circle and lets the user
 * know if the circles overlap or if one is completly inide the other and also shows if a point is inside the user created circle.
 */


 public class JavaPractical2{
        public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2,2,1.5);

        System.out.println("Area is " + c1.getArea());

        System.out.println("Perimeter is " + c1.getPerimeter());

        System.out.println(c1.contains(3, 3));

        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));

        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}

class Circle2D {
    // data fields
    private double x;
    private double y;
    private double radius;

    // default constructor
    public Circle2D() {
        this.x = 0.0;
        this.y = 0.0;
        this.radius = 1.0;
    }

    // user circle constructor
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    // getter methods
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    // calculate area 
    public double getArea() {
     return Math.PI * radius * radius;
    }
    
    // calculate perimeter 
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // check if a point is inside the circle
    public boolean contains(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance <= radius;
    }
    
    // check if the circle is inside another circle
    public boolean contains(Circle2D other) {
        double distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        return distance + this.radius <= other.radius;
    }
    
    // check if the circle overlaps another circle
    public boolean overlaps(Circle2D other) {
        double distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        return distance < (this.radius + other.radius);
    }
} 

