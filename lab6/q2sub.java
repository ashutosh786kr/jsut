public class q2sub{
    public  void subtract(int a, int b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
     public void subtract(double a, double b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
    public void subtract(int a, double b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
    public void subtract(double a, int b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
   public static void main(String[] args) {
       q2sub obj = new q2sub();
       obj.subtract(2, 0);
       obj.subtract(2.5, 1.2);
       obj.subtract(3, 1.9);
       obj.subtract(3,3);
     }
}