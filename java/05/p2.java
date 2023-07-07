import java.util.Scanner;
public class p2 {
   public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.print("enter value of n : ");
         Integer n , i , j;
         n = sc.nextInt();

         System.out.print("enter the character : ");
         // char ch = sc.nextChar();

         for(i=0 ; i<n ; i++){
            for(j=n-i ; j>0 ; j--){
               System.out.print(" ");
            }
            for(j=0 ; j<(i*2)-1 ; j++){
               System.out.print("*");
            }

            System.out.println();
         }

         for(i=0 ; i<n ; i++){
            for(j=0 ; j<i ; j++){
               System.out.print(" ");
            }

            for(j=0 ; j<(n-i)*2-1 ; j++){
               System.out.print("*");
            }
            
            System.out.println();
         }
   } 
}
