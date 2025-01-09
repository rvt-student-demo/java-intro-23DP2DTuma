package lv.rvt;


public class Box {
    private final double width;
    private final double height;
    private final double length;

    // Constructor with three dimensions
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Constructor for a cube
    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    // Copy constructor
    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    // Public methods to access dimensions
    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double length() {
        return length;
    }

    // Calculate volume
    public double volume() {
        return width * height * length;
    }

    // Calculate surface area
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    // Private helper methods
    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    // Method to create a larger box
    public Box biggerBox() {
        return new Box(1.25 * width, 1.25 * height, 1.25 * length);
    }

    // Method to create a smaller box
    public Box smallerBox() {
        return new Box(0.75 * width, 0.75 * height, 0.75 * length);
    }

    // Method to check nesting
    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width &&
               this.height < outsideBox.height &&
               this.length < outsideBox.length;
    }
}
