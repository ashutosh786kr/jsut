import java.util.HashMap;
import java.util.Scanner;

public class q5_CountOccurrences {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a list of integer numbers (separated by spaces): ");
      String input = scanner.nextLine();
      
      String[] numbers = input.split("\\s+");
      int[] array = new int[numbers.length];
      
      for(int i = 0; i < numbers.length; i++) {
         array[i] = Integer.parseInt(numbers[i]);
      }
      
      HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
      
      for(int i = 0; i < array.length; i++) {
         if(countMap.containsKey(array[i])) {
            int count = countMap.get(array[i]);
            countMap.put(array[i], count + 1);
         } else {
            countMap.put(array[i], 1);
         }
      }
      
      System.out.println("Number of occurrences of each element:");
      
      for(int key : countMap.keySet()) {
         System.out.println(key + ": " + countMap.get(key));
      }
   }
}