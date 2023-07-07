import java.util.Scanner;

class TwoD {
    double length, width;

    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class ThreeD extends TwoD {
    double height;

    ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }
}

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, width and height of the plastic box: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        ThreeD box = new ThreeD(length, width, height);
        double boxCost = box.volume() * 60;
        System.out.println("The cost of the plastic box is Rs " + boxCost);

        System.out.print("Enter length and width of the plastic sheet: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
        TwoD sheet = new TwoD(length, width);
        double sheetCost = sheet.area() * 40;
        System.out.println("The cost of the plastic sheet is Rs " + sheetCost);
    }
}