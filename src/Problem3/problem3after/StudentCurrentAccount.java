package Problem3.problem3after;

public class StudentCurrentAccount implements StudentAccount{
    private double balance;
    private final double limit;
    public StudentCurrentAccount(double balance,double limit){
        this.balance = balance;
        this.limit = limit;
    }
    public void withdraw(double amount ){
        if(amount > limit){
            throw new IllegalArgumentException("Amount exceeds 200 MAD");
        }
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
