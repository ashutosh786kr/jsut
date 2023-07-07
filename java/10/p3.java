import java.util.Scanner;

public class p3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        
        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        
        // Change the case of the first string
        System.out.println("Uppercase of first string: " + string1.toUpperCase());
        System.out.println("Lowercase of first string: " + string1.toLowerCase());
        
        // Reverse the first string
        String reverseString1 = new StringBuilder(string1).reverse().toString();
        System.out.println("Reverse of first string: " + reverseString1);
        
        // Compare the two strings
        if (string1.equals(string2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
        
        // Insert the second string into the first string
        System.out.print("Enter the index to insert the second string at: ");
        int index = scanner.nextInt();
        String newString1 = string1.substring(0, index) + string2 + string1.substring(index);
        System.out.println("New string after inserting second string: " + newString1);
        
        // Count the occurrence of the second string in the first string
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = string1.indexOf(string2, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += string2.length();
            }
        }
        System.out.println("Number of times second string appears in first string: " + count);
        
        scanner.close();
    }
}