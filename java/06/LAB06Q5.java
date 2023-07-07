import java.util.Scanner;

public class LAB06Q5 {
    private int[] numbers;
    private int n;
    
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        n = sc.nextInt();
        numbers = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
    }
    
    public void swap() {
        if (n < 2) {
            return;
        }
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;
    }
    
    public void display() {
        System.out.print("Swapped integers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LAB06Q5 num = new LAB06Q5();
        num.read();
        num.swap();
        num.display();
    }
}