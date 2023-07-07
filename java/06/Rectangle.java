import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    Rectangle(){}

    double perimeter() {
        return 2*(width + height) ;
    }

    double Area(){
	return (height*width);
    }


    void display() {
        System.out.println("The perimeter  : "+perimeter());
	System.out.println("The Area  : "+Area());
    }

    public static void main(String[] args) {
        int l, b;
        System.out.println("Enter the length, breadth of the rectangle : ");
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        b = in.nextInt();
        in.close();

        Rectangle box1 = new Rectangle(l, b);
        box1.display();
    }
}