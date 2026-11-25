abstract class BankAccountBase {
    protected double balance;
    BankAccountBase(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }
    abstract double annualInterest();
}

public class absBank extends BankAccountBase {
    private final double rate;
    absBank(double balance, double rate) { super(balance); this.rate = rate; }
    @Override double annualInterest() { return balance * rate / 100.0; }
    public static void main(String[] args) {
        absBank account = new absBank(10000, 4.5);
        System.out.printf("Annual interest: %.2f%n", account.annualInterest());
    }
}
