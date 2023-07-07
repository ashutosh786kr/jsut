//Marketing package
package marketing;
import general.Employee ;

public class Sales extends Employee {
    
    //Constructor
    public Sales(int empid, String empname, double basicPay) {
        super(empid, empname, basicPay);
    }
    
    public double travelallowance() {
        double totalEarnings = earnings();
        double travelAllowance = 0.05 * totalEarnings;
        return travelAllowance;
    }
}


