Copy code
import java.util.Scanner;

public class q1_LargestAmongThreeNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter first number: ");
      double num1 = scanner.nextDouble();
      
      System.out.print("Enter second number: ");
      double num2 = scanner.nextDouble();
      
      System.out.print("Enter third number: ");
      double num3 = scanner.nextDouble();
      
      double largest = num1;
      
      if(num2 > largest) {
         largest = num2;
      }
      
      if(num3 > largest) {
         largest = num3;
      }
      
      System.out.println("The largest number is " + largest);
   }
}