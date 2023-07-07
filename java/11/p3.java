class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class p3{
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgumentException("At least four arguments are required.");
            } else {
                int sum = 0;
                for (String arg : args) {
                    int num = Integer.parseInt(arg);
                    sum += num * num;
                }
                System.out.println("Sum of squares of all numbers: " + sum);
            }
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("All arguments should be integers.");
        }
    }
}