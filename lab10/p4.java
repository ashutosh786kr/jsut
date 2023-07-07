public class p4 {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
        
       
        sb.append("Hello");
        sb.append(" World");
        System.out.println("After appending: " + sb);
        
        
        sb.delete(5, 11);
        System.out.println("After deleting: " + sb);
       
        sb.replace(2, 4, "L");
        System.out.println("After replacing: " + sb);
    }
}
