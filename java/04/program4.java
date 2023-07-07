import java.util.Scanner;

public class program4 {
    public static void main(String args[]){  
        int rem,sum=0,temp;    
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        
        temp=n;    
        while(n>0){    
         rem=n%10;  
         sum=(sum*10)+rem;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome");    
         sc.close();
      }  
      
}
