import java.util.Scanner;

public class p1{
	public static void main(String args[]){
		Integer m = 0;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		if(m>90){
			System.out.println("Grade: O");
		}
		else if(m>80){
			System.out.println("Grade: E");			
		}
		else if(m>70){
			System.out.println("Grade: A");			
		}
		else if(m>60){
			System.out.println("Grade: B");			
		}
		else if(m>50){
			System.out.println("Grade: C");		
		}
		else{System.out.println("fail");}
	}
}