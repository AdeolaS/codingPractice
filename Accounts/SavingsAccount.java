//package Accounts;
//import accountsPackage.Account;

public class SavingsAccount extends Account{

    private int accountNumber;
    private double balance;
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        this.balance = balance * interestRate + balance;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public void setInterestRate(double newInterestRate){
        this.interestRate = newInterestRate;
    }

}