import java.util.Scanner;

public class matrix{
    public static void main(String[] args) {
        int LeftDiag=0;
        int RightDiag=0;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
                if(i==j)
                    RightDiag += arr[i][j];
            }
        }
        int m=3;
        for(int i=0; i<3; i++){
            m--;
            for(int j=0; j<3; j++){
                if(j==m)
                    LeftDiag += arr[i][j];
            }
        }

        System.out.println("Right Diagonal sum : "+RightDiag);
        System.out.println("Left Diagonal sum : "+LeftDiag);
    }
}