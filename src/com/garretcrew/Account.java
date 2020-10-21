package com.garretcrew;

public abstract class Account implements IBaseRate {
    // List common properties for checking and saving accounts
    String name;
    String sSN;
    double balance;

    static int UID = 10000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize accounts
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        //Set acc number
        this.accountNumber = setAccountNumber();

    }

    private String setAccountNumber() {
        UID++;
        return sSN.substring(sSN.length()-2, sSN.length()) + UID + (int) (Math.random() * Math.pow(10, 3));
    }

    // List common methods
    public void showInfo() {
        System.out.println(
                "MANE: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance
        );
    }
}
