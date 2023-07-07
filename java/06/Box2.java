import java.util.Scanner;

public class Box2 {

	public static void area(int a , int b){
		System.out.print(a*b);
	}

	public static void area(int a){
		System.out.print(a*a);
	}

	public static void area(double r){
		System.out.print(r*3.14);
	}

    public static void main(String[] args) {
        int l = 10, b = 30;
	double r = 5;
	System.out.print("\narea of traingle = ");
        area(l , b);
	
	System.out.print("\narea of square = ");
        area(l);

	System.out.print("\narea of circle = ");
        area(r);

    }
}