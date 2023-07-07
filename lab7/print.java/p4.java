public class p4 {
    public static void main(String[] args) {
        // Create a StringBuffer object with initial capacity of 16
        StringBuffer sb = new StringBuffer();
        System.out.println("Capacity of StringBuffer: " + sb.capacity()); // 16
        
        // Append a string to the StringBuffer
        sb.append("Hello");
        sb.append(" World");
        System.out.println("After appending: " + sb); // Hello World
        
        // Delete a sequence of characters from the StringBuffer
        sb.delete(5, 11);
        System.out.println("After deleting: " + sb); // Hello
        
        // Replace a sequence of characters in the StringBuffer with a string
        sb.replace(2, 4, "L");
        System.out.println("After replacing: " + sb); // HeLo
    }
}
