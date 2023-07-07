abstract class Shape{
    public abstract void rectangleArea(double length, double breadth);
    public abstract void squareArea(double side);
    public abstract void circleArea(double radius);
}

class Area extends Shape{
    public void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void circleArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class p2{
    public static void main(String[] args) {
        Area areaObj = new Area();
        areaObj.rectangleArea(5, 10);
        areaObj.squareArea(4);
        areaObj.circleArea(6);
    }
}