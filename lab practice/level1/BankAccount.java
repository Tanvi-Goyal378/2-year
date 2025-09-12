public class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001);
        BankAccount acc2 = new BankAccount("Bob", 1002);

        if (acc1 instanceof BankAccount) {
            System.out.println("Account Holder: " + acc1.accountHolderName);
            System.out.println("Account Number: " + acc1.accountNumber);
            System.out.println("Bank Name: " + bankName);
        }

        if (acc2 instanceof BankAccount) {
            System.out.println("Account Holder: " + acc2.accountHolderName);
            System.out.println("Account Number: " + acc2.accountNumber);
            System.out.println("Bank Name: " + bankName);
        }

        getTotalAccounts();
    }
}
