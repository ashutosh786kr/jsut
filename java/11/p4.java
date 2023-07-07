class LessMinimumBalanceException extends Exception {
    public LessMinimumBalanceException(String message) {
        super(message);
    }
}

class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;
    private final int minimumBalance = 5000;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws LessMinimumBalanceException, InvalidWithdrawalException {
        if (balance - amount < minimumBalance) {
            throw new LessMinimumBalanceException("Insufficient balance to withdraw " + amount + " rupees.");
        } else if (balance - amount < 0) {
            throw new InvalidWithdrawalException("Cannot withdraw " + amount + " rupees. This would leave a negative balance in the account.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + " rupees. Current balance: " + balance + " rupees.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class p4{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        System.out.println("Current balance: " + account.getBalance() + " rupees.");

        try {
            account.withdraw(3000);
        } catch (LessMinimumBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(8000);
        } catch (LessMinimumBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(8000);
        } catch (LessMinimumBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }
    }
}