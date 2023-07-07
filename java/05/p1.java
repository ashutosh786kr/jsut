import java.util.Scanner;

public class p1{
    public static void main(String args[]){
        Integer a,b,ch,c = 1,n;
        Scanner sc = new Scanner(System.in);

        
        while(c == 1){
            System.out.println("\n---OPERATIONS---\n\n1 add\n2 sub\n3 mul\n4 div\n\nEnter your choice : ");
            ch = sc.nextInt();

            switch(ch){
            case 1 :
                System.out.println("\n--enter two numbers to add :--\n");
                a = sc.nextInt();
                b = sc.nextInt();
                n = a+b;
                System.out.println("\nResult : " + n + "\nDo you want to continue?");
                break;
            
            case 2 :
                System.out.println("\n--enter two number subract--\n");
                a = sc.nextInt();
                b = sc.nextInt();
                n = a-b;
                System.out.println("\nResult : " + n + "\nDo you want to continue?");
                break;

            case 3 :
                System.out.println("\n--enter two numbers to multiply--\n");
                a = sc.nextInt();
                b = sc.nextInt();
                n = a*b;
                System.out.println("\nResult : " + n + "\nDo you want to continue?");
                break;

            case 4 :
                System.out.println("\n--enter two number two divide--\n");
                a = sc.nextInt();
                b = sc.nextInt();
                n = a/b;
                System.out.println("\nResult : " + n + "\nDo you want to continue?");
                break;
            }
            c = sc.nextInt();
        }
        
    }
}