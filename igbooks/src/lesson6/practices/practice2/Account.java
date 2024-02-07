package lesson6.practices.practice2;

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
        
    @Override
    public String toString() {
        return "Current balance is " + balance;
    }    
}