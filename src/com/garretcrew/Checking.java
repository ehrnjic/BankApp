package com.garretcrew;

public class Checking extends Account{
    // List properties specific to a Checking account
    int debitCardNumber;
    int getDebitCardPIN;


    // Constructor to initialize checking account properties

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("ACCOUNT NUMBER: " + accountNumber);
        System.out.println("NEW CHECKING ACCOUNT");
    }

    // List any method specific to the checking account


}
