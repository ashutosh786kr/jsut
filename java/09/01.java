abstract class Student {
    protected String name;
    protected int rollNo;
    protected int regNo;

    public Student(String name, int rollNo, int regNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    public abstract String course();

    public abstract void academics();
}

 class KIITian extends Student {
    private String branch;
    private double cgpa;

    public KIITian(String name, int rollNo, int regNo, String branch, double cgpa) {
        super(name, rollNo, regNo);
        this.branch = branch;
        this.cgpa = cgpa;
    }

    //@Override
    public String course() {
        return "BTech " + branch;
    }

    //@Override
    public void academics() {
        System.out.println("CGPA: " + cgpa);
    }
}
class p1{
	public static void main(String[] args){
		KIITian student = new KIITian("John", 1234, 5678, "CSE", 8.5);
		System.out.println(student.course()); // Output: "BTech CSE"
		student.academics(); // Output: "CGPA: 8.5"
 	}
}