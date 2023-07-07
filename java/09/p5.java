import java.lang.*;
interface assign9q1
{
   public void earning(int basic);
   public void deduction(int basic);
   public void bonus(int basic);
}

abstract class Manager implements assign9q1
{
  public void earning(int basic)
  {
     float x=(8*basic)/10;
     float y=(15*basic)/10;
     float z=x+y+basic;
     System.out.println("Earning =" +z);
     
  }
   public void deduction(int basic)
  {
     float x= (12 * basic)/100;
     System.out.println("Deduction =" +x);
  }
 
}

class Substaff extends Manager
{
  public void bonus(int basic)
  {
    float x= (basic)/2;
    System.out.println("Bonus =" +x);
  }
}

class p5
{
public static void main(String[] args)
{
  assign9q1 m1=new Substaff();
  m1.deduction(10000);
  m1.earning(10000);
  m1.bonus(10000);
  
  
}
}
