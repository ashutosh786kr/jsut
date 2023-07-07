public class q4_ObjectCounter {
   private static int count = 0;
   
   public q4_ObjectCounter() {
      count++;
   }
   
   public static int getCount() {
      return count;
   }
   
   public static void main(String[] args) {
      q4_ObjectCounter obj1 = new q4_ObjectCounter();
      q4_ObjectCounter obj2 = new q4_ObjectCounter();
      q4_ObjectCounter obj3 = new q4_ObjectCounter();
      
      System.out.println("Number of objects created: " + q4_ObjectCounter.getCount());
   }
}