import java.util.Scanner;

public class p3{
	public static void main(String args[]){
		System.out.println("Enter date b/w 1 and 31");
		Scanner sc = new Scanner(System.in);
		Integer x = 0;
		x = sc.nextInt();
		if(x>0 && x<32){
			x = (x-1)%7;

			switch(x){
				case 0:
					System.out.println("monday");
					break;

				case 1:
					System.out.println("tuesday");
					break;

				case 2:
					System.out.println("wednesday");
					break;

				case 3:
					System.out.println("thursday");
					break;

				case 4:
					System.out.println("firday");
					break;

				case 5:
					System.out.println("saturday");
					break;

				case 6:
					System.out.println("sunday");
					break;
			}
		}
		else{System.out.println("Invalid");}
	}
}