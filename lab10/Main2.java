abstract class Shape {
    abstract void display();
}

class TwoDimensionalShape extends Shape {
    @Override
    void display() {
        System.out.println("Displaying 2D image.");
    }
}

class ThreeDimensionalShape extends Shape {
    @Override
    void display() {
        System.out.println("Displaying 3D image.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape shape1 = new TwoDimensionalShape();
        Shape shape2 = new ThreeDimensionalShape();

        shape1.display();
        shape2.display();
   }
}
