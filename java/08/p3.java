import java.util.Scanner;

class Shape {
    double area;

    void calculateArea() {
        System.out.println("Calculating area...");
    }

    void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    void showArea() {
        System.out.println("Circle:");
        super.showArea();
    }
}

class Rectangle extends Shape {
    double length, width;

    void calculateArea() {
        area = length * width;
    }

    void showArea() {
        System.out.println("Rectangle:");
        super.showArea();
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        System.out.print("Enter the radius of the circle: ");
        c.radius = sc.nextDouble();
        c.calculateArea();
        c.showArea();

        Rectangle r = new Rectangle();
        System.out.print("Enter the length of the rectangle: ");
        r.length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        r.width = sc.nextDouble();
        r.calculateArea();
        r.showArea();

        sc.close();
    }
}