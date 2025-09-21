// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance >= 0 ? balance : 0;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: ₹" + balance);
    }
}

// Interface Loanable
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Annual interest rate in percentage
    private double minBalance;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate, double minBalance) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    @Override
    public double calculateInterest() {
        if (getBalance() >= minBalance) {
            return getBalance() * interestRate / 100;
        }
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for ₹" + amount + " for Savings Account holder.");
        } else {
            System.out.println("Loan denied for Savings Account holder.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= minBalance;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate; // Usually low or zero for current accounts
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit; }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;  // Could be zero or small
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            double newBalance = getBalance() - amount;
            // We don't have setter for balance; so to keep encapsulation, let's modify using reflection or protected. 
            // To keep it simple, let's make a protected method to update balance.
            updateBalance(newBalance);
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + getBalance());
        } else {
            System.out.println("Withdrawal amount exceeds balance + overdraft limit.");
        }
    }

    protected void updateBalance(double newBalance) {
        // Update balance - helper method to bypass private balance in superclass
        try {
            java.lang.reflect.Field balanceField = BankAccount.class.getDeclaredField("balance");
            balanceField.setAccessible(true);
            balanceField.set(this, newBalance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for ₹" + amount + " for Current Account holder.");
        } else {
            System.out.println("Loan denied for Current Account holder.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // arbitrary eligibility criteria
    }
}

// Main class demonstrating polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA001", "Alice", 50000, 5, 1000),
            new CurrentAccount("CA001", "Bob", 20000, 1, 5000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: ₹" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(100000);
            }
            System.out.println("----------------------------");
        }
    }
}
