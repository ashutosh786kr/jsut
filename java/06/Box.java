import java.util.Scanner;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(){}

    double volume() {
        return width * height * depth;
    }

    double surfaceArea(){
	return (2*height*width + 2*width*depth + 2*height*depth);
    }


    void display() {
        System.out.println("The volume  : "+volume());
	System.out.println("The volume  : "+surfaceArea());
    }

    public static void main(String[] args) {
        int l, b, h;
        System.out.println("Enter the length, breadth and height of the box : ");
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        b = in.nextInt();
        h = in.nextInt();
        in.close();

        Box box1 = new Box(l, b, h);
        box1.display();
    }
}