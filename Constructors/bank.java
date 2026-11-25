public class bank {
    private final String accountHolder;
    private double balance;
    bank(String accountHolder, double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Opening balance cannot be negative");
        this.accountHolder = accountHolder; this.balance = openingBalance;
    }
    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }
    boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
        if (amount > balance) return false;
        balance -= amount; return true;
    }
    void display() { System.out.printf("%s - Balance: %.2f%n", accountHolder, balance); }

    public static void main(String[] args) {
        bank account = new bank("Sample Customer", 1000);
        account.deposit(500); account.withdraw(200); account.display();
    }
}
