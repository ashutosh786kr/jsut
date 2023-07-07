// Demo.java

import geometry.Circle;

public class DEMO1 {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(5.0);
    
    double area = circle.getArea();
    double perimeter = circle.getPerimeter();
    
    System.out.println("Radius: " + circle.getRadius());
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
 }
}