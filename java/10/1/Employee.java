//General package
package general;

public class Employee {
    private int empid;
    private String empname;
    private double basicPay;
    
    //Constructor
    public Employee(int empid, String empname, double basicPay) {
        this.empid = empid;
        this.empname = empname;
        this.basicPay = basicPay;
    }
    
    public double earnings() {
        double da = 0.8 * basicPay;
        double hra = 0.15 * basicPay;
        double totalEarnings = basicPay + da + hra;
        return totalEarnings;
    }
    
    //Getter and Setter methods for empname and basicPay
    public String getEmpname() {
        return empname;
    }

    public int getEmpid(){
	return empid;
    }
    
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    
    public double getBasicPay() {
        return basicPay;
    }
    
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
}

