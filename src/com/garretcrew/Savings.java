package com.garretcrew;

public class Savings extends Account{
    // List properties specific to a Saving account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    // Constructor to initialize settings saving account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("ACCOUNT NUMBER: " + accountNumber);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any method specific to the saving account
}
