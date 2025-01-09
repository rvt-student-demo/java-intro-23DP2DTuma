package lv.rvt;


public class BoxTester {
    public static void main(String[] args) {
        // Test case for basic functionality
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area());
        System.out.println("Volume: " + box.volume());

        // Testing the private encapsulation (uncommenting the below lines should cause a compile error)
        // System.out.println("Width: " + box.width);

        // Access dimensions using methods
        System.out.println("Width: " + box.width());
        System.out.println("Height: " + box.height());
        System.out.println("Length: " + box.length());

        // Test case for bigger and smaller boxes
        Box bigger = box.biggerBox();
        System.out.println("Bigger Box - Width: " + bigger.width() + ", Height: " + bigger.height() + ", Length: " + bigger.length());

        Box smaller = box.smallerBox();
        System.out.println("Smaller Box - Width: " + smaller.width() + ", Height: " + smaller.height() + ", Length: " + smaller.length());

        // Test case for nesting
        Box outerBox = new Box(3.0, 6.0, 7.0);
        System.out.println("Does the smaller box nest in the outer box? " + smaller.nests(outerBox));
        System.out.println("Does the original box nest in the outer box? " + box.nests(outerBox));
        System.out.println("Does the bigger box nest in the outer box? " + bigger.nests(outerBox));
    }
}

