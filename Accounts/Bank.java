//package Accounts;

//import Accounts.SavingsAccount;


public class Bank{
    public static void main(String[] args) {
        SavingsAccount mySavingsAccount = new SavingsAccount(123456, 5000, 0.125);

        System.out.println(mySavingsAccount.getAccountNumber());

        //System.out.println("Hello Software Engineer.");
    }
}