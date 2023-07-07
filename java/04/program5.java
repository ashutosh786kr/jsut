import java.util.Scanner;

public class program5 {
    public static void main(String[] args)
     {
        String fname;
        String lname;

        Scanner sc =new Scanner(System.in);
        fname= sc.next();
        lname= sc.next();
        System.out.print(lname +" "+ fname);
        sc.close();
     }
}
