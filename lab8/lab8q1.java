abstract class Student 
{
    int roll, reg;
    abstract void course();
}
class KIITan extends Student
{
    void course() 
    {
        System.out.print("Implementing  'Course' func");
    }
}
class lab8q1
{
    public static void main(String args[])
    {
        KIITan s = new KIITan();
        s.course();
 }
} 
    


