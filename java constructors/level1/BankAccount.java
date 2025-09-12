public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Rahul", 5000);
        System.out.println("Account Number: " + sa.accountNumber);
        System.out.println("Account Holder: " + sa.accountHolder);
        System.out.println("Balance: " + sa.getBalance());

        sa.deposit(2000);
        System.out.println("New Balance after deposit: " + sa.getBalance());
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
}
