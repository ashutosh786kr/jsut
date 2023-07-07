//Main program
import java.util.Random;

import marketing.Sales;


public class Main {
    public static void main(String[] args) {
        
        //Create an array of Sales objects
        Sales[] salespersons = new Sales[5];
        
        //Random object to generate employee ids
        Random rand = new Random();
        
        //Assign employee ids and basic pay for each salesperson
        for (int i = 0; i < salespersons.length; i++) {
            int empid = rand.nextInt(9000) + 1000; //Generate a 4-digit number
            String empname = "Salesperson " + (i+1);
            double basicPay = 15000; //Assuming a fixed basic pay for all salespersons
            salespersons[i] = new Sales(empid, empname, basicPay);
        }
        
        //Print the total earnings and travel allowance for each salesperson
        for (Sales salesperson : salespersons) {
            double totalEarnings = salesperson.earnings();
            double travelAllowance = salesperson.travelallowance();
            System.out.println("Employee ID: " + salesperson.getEmpid());
            System.out.println("Employee Name: " + salesperson.getEmpname());
            System.out.println("Total Earnings: " + totalEarnings);
            System.out.println("Travel Allowance: " + travelAllowance);
            System.out.println("--------------------------");
        }
    }
}