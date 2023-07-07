import java.util.Scanner;

public class q2_EvenOddNumbers {
   public static void main(String args[]) {
      Integer num, evenCount = 0, oddCount = 0;
      
      for(int i =0 ; i< 10 ;i++) {
         num = Integer.parseInt(args[i]);
         if(num % 2 == 0) {
            evenCount++;
         } else {
            oddCount++;
         }
      }
      
      System.out.println("Number of even integers: " + evenCount);
      System.out.println("Number of odd integers: " + oddCount);
   }
}