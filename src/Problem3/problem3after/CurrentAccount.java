package Problem3.problem3after;

public class CurrentAccount implements WithdrawableAccount{
    private double balance;
    public CurrentAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount){
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
