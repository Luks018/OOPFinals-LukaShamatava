package finalexam.task1;

public class Circle implements Drawable {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the Draw method from the Drawable interface
    @Override
    public void Draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Main method for testing
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.Draw();  // Output: Drawing a circle with radius: 5.0
    }
}
