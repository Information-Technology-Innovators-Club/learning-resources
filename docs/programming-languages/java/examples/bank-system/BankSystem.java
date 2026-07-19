// Encapsulated Bank Account example
public class BankSystem {
    public static class BankAccount {
        private final String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public synchronized void deposit(double amount) {
            if (amount > 0) balance += amount;
        }

        public synchronized boolean withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public double getBalance() { return balance; }
        public String getAccountNumber() { return accountNumber; }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("ITIC-999-XYZ", 1500.0);
        account.deposit(500);
        boolean success = account.withdraw(200);
        System.out.println("Transaction status: " + (success ? "Success" : "Failed"));
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
