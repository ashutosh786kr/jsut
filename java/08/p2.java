class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Constructing Rectangle with length " + length + " and breadth " + breadth);
    }
}

class Box extends Rectangle {
    double height;

    Box(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
        System.out.println("Constructing Box with length " + length + ", breadth " + breadth + ", and height " + height);
    }
}

class HollowBox extends Box {
    double thickness;

    HollowBox(double length, double breadth, double height, double thickness) {
        super(length, breadth, height);
        this.thickness = thickness;
        System.out.println("Constructing HollowBox with length " + length + ", breadth " + breadth + ", height " + height + ", and thickness " + thickness);
    }
}

public class p2 {
    public static void main(String[] args) {
        HollowBox hb = new HollowBox(10, 20, 5, 1);
    }
}