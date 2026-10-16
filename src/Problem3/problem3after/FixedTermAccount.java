package Problem3.problem3after;

public class FixedTermAccount implements Account{
    private double balance;
    public FixedTermAccount(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
}
