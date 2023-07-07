import java.util.Arrays;
import java.util.Scanner;

public class q3_SortNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a list of numbers (separated by spaces): ");
      String input = scanner.nextLine();
      
      String[] numbers = input.split("\\s+");
      double[] array = new double[numbers.length];
      
      for(int i = 0; i < numbers.length; i++) {
         array[i] = Double.parseDouble(numbers[i]);
      }
      
      Arrays.sort(array);
      
      System.out.print("Sorted list of numbers: ");
      
      for(int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
   }
}