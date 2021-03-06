package com.garretcrew;

public abstract class Account implements IBaseRate {
    // List common properties for checking and saving accounts
    private String name;
    private String sSN;
    private double balance;

    private static int UID = 10000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize accounts
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        //Set acc number
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        UID++;
        return sSN.substring(sSN.length()-2, sSN.length()) + UID + (int) (Math.random() * Math.pow(10, 3));
    }

    public void compound(){
        double accuredInterest = balance * (rate/100);
        balance = balance + accuredInterest;
        System.out.println("Accrued interest $:" + accuredInterest);
        printBalance();
    }

    // List common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $:" + amount + " to account:" + accountNumber);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $:" + amount + " from account:" + accountNumber);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " from account:" + accountNumber+ " to " + toWhere);
        printBalance();
    }

    public void showInfo() {
        System.out.println(
                "MANE: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"
        );
    }

    public void printBalance(){
        System.out.println("Your balance is now $:" + balance);
    }
}
