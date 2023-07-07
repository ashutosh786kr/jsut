import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        try {
            processor.processInput();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

    public void processInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        scanner.close();
        
        if (input < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        } else {
            double result = input * 2.0;
            System.out.println("Result: " + result);
        }
    }
}