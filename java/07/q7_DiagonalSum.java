import java.util.Scanner;

public class q7_DiagonalSum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[][] matrix = new int[5][5];
      
      System.out.println("Enter the elements of the matrix:");
      
      for(int i = 0; i < 5; i++) {
         for(int j = 0; j < 5; j++) {
            matrix[i][j] = sc.nextInt();
         }
      }
      
      int leftSum = 0, rightSum = 0;
      
      for(int i = 0; i < 5; i++) {
         leftSum += matrix[i][i];
         rightSum += matrix[i][4-i];
      }
      
      System.out.println("Sum of left diagonal: " + leftSum);
      System.out.println("Sum of right diagonal: " + rightSum);
   }
}