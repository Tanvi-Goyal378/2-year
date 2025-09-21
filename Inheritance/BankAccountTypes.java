public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV123", 15000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK456", 8000.0, 10000.0);
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 50000.0, 12);

        savings.displayAccountType();
        System.out.println("Account Number: " + savings.accountNumber);
        System.out.println("Balance: ₹" + savings.balance);
        System.out.println("Interest Rate: " + savings.interestRate + "%\n");

        checking.displayAccountType();
        System.out.println("Account Number: " + checking.accountNumber);
        System.out.println("Balance: ₹" + checking.balance);
        System.out.println("Withdrawal Limit: ₹" + checking.withdrawalLimit + "\n");

        fd.displayAccountType();
        System.out.println("Account Number: " + fd.accountNumber);
        System.out.println("Balance: ₹" + fd.balance);
        System.out.println("Deposit Term: " + fd.termInMonths + " months");
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int termInMonths;

    FixedDepositAccount(String accountNumber, double balance, int termInMonths) {
        super(accountNumber, balance);
        this.termInMonths = termInMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
