import java.util.Scanner;

public class zero {
    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1 / number2;
    } // End of quotient() method

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            int result;
            result = quotient(number1, number2);
            System.out.println("This statement and the next will not be executed if exception occurs");
            System.out.println(number1 + " / " + number2 + " is " + result);
        } // End of try block

        catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cannot be");
        } // End of catch
        System.out.println("Execution continues ...");
    } // End of main() method

} // End of class