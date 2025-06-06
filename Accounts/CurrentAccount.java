//package Accounts;
//import Account;

public class CurrentAccount extends Account{

    private int accountNumber;
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double newOverdraftLimit){
        this.overdraftLimit = newOverdraftLimit;
    }
}