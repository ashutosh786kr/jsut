import java.util.Scanner;

public class LAB06Q7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display the menu to the user
        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");
        
        // Get the user's choice from the menu
        int choice = scanner.nextInt();
        
        // Calculate the area based on the user's choice
        switch (choice) {
            case 1: // Circle
                System.out.print("Please Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = 3.14 * radius * radius;
                System.out.println("The area of the circle is: " + circleArea);
                break;
                
            case 2: // Square
                System.out.print("Enter the length of one side of the square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("The area of the square is: " + squareArea);
                break;
                
            case 3: // Triangle
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + triangleArea);
                break;
                
            default: // Invalid choice
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                break;
        }
        
        // Close the scanner
        scanner.close();
    }
}