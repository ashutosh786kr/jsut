 class Employee {
    String Name;
    int Emp_ID;
    double Basic_Salary;
    double Gross_Salary;
    
    public Employee(String name, int emp_ID, double basic_Salary) {
        Name = name;
        Emp_ID = emp_ID;
        Basic_Salary = basic_Salary;
    }
    
    public void find_GrossSalary() {
        Gross_Salary = Basic_Salary;
    }
    
    public void display() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee ID: " + Emp_ID);
        System.out.println("Basic Salary: " + Basic_Salary);
        System.out.println("Gross Salary: " + Gross_Salary);
    }
}

class TechEmp extends Employee {
    double HRA;
    double DA;

    public TechEmp(String name, int emp_ID, double basic_Salary, double hra, double da) {
        super(name, emp_ID, basic_Salary);
        HRA = hra;
        DA = da;
    }

    @Override
    public void find_GrossSalary() {
        Gross_Salary = Basic_Salary + DA + HRA;
    }
}

class NonTechEmp extends Employee {
    int YearOfExperience;

    public NonTechEmp(String name, int emp_ID, double basic_Salary, int yearOfExperience) {
        super(name, emp_ID, basic_Salary);
        YearOfExperience = yearOfExperience;
    }

    @Override
    public void find_GrossSalary() {
        Gross_Salary = Basic_Salary * YearOfExperience;
    }
}

public class p3 {
    public static void main(String[] args) {
        Employee emp1 = new TechEmp("John", 1001, 50000, 10000, 60000);
        Employee emp2 = new NonTechEmp("Jane", 1002, 30000, 5);

        emp1.find_GrossSalary();
        emp2.find_GrossSalary();

        emp1.display();
        emp2.display();
    }
}