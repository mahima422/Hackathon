class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Amount: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Current Balance     : Rs. " + checkBalance());
    }

    public static void main(String[] args) {

        String accountNumber = "ACC10025";
        String accountHolderName = "Rishita";
        double initialBalance = 10000.00;

        BankAccount account =
            new BankAccount(accountNumber, accountHolderName, initialBalance);

        System.out.println("Bank Account Management System");

        account.displayAccount();

        account.deposit(5000.00);

        account.withdraw(3000.00);

        account.displayAccount();
    }
}
