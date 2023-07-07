import java.util.Scanner;
public class simple {
    public static void main(String[] args){
        int hours,wage;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers of hours");
        hours=sc.nextInt();
        System.out.println("enter the wages:");
        wage=sc.nextInt();
        System.out.println("the gross wage is :"+(hours*wage));

    }
}
