import java.util.Scanner;

class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhaarNumber;

    Person(int accountNumber, double balance, String name, String aadhaarNumber) {
        super(accountNumber, balance);
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
    }

    @Override
    void display() {
        System.out.println("Account details:");
        super.display();
        System.out.println("Name: " + name);
        System.out.println("Aadhaar number: " + aadhaarNumber);
    }
}

public class p4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer[] customers = new Customer[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for customer " + (i + 1) + ":");

            System.out.print("Account number: ");
            int accountNumber = sc.nextInt();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Aadhaar number: ");
            String aadhaarNumber = sc.next();

            customers[i] = new Customer(accountNumber, balance, name, aadhaarNumber);
        }

        System.out.println("Customer details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Customer " + (i + 1) + ":");
            customers[i].display();
            System.out.println();
        }

        sc.close();
    }
}

class Customer extends Person {
    Customer(int accountNumber, double balance, String name, String aadhaarNumber) {
        super(accountNumber, balance, name, aadhaarNumber);
    }
}